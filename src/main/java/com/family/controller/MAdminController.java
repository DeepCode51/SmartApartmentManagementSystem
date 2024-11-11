package com.family.controller;

import com.family.pojo.MAdmin;
import com.family.service.MAdminMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/family")
public class MAdminController {
    @Autowired
    private MAdminMapperService mAdminMapperService;
    private Map<String, Object> map = new HashMap<>();

    /**
     * 管理员登录
     *
     * @param mAdmin
     * @param request
     * @return
     */
    @RequestMapping("/login.m")
    @ResponseBody
    public Map<String, Object> adminLogin(MAdmin mAdmin, HttpServletRequest request) {
        Map<String, Object> admin = mAdminMapperService.adminLogin(mAdmin);
        if (admin != null) {
            request.getSession().setAttribute("MAdmin", admin);
            request.getSession().setAttribute("mname", mAdmin.getMname());

        }
        return admin;
    }

    /**
     * 管理员退出登录
     *
     * @param session
     * @return
     */
    @RequestMapping("/signOut")
    @ResponseBody
    public Map<String, Object> signOut(HttpSession session) {
        session.removeAttribute("MAdmin");
        session.removeAttribute("mname");
        map.put("signOut", "signOut");
        return map;
    }

    /**
     * 查询管理员的列表
     *
     * @return
     */
    @RequestMapping("/adminlist.m")
    @ResponseBody
    public Map<String, Object> mAdminList() {
        List<MAdmin> mAdmins = mAdminMapperService.mAdminList();
        if (mAdmins != null) {
            map.put("code", 0);
            map.put("msg", "");
            map.put("count", mAdmins.size());
            map.put("data", mAdmins);
        }
        return map;
    }

    /**
     * 添加一条管理员信息
     *
     * @param mAdmin
     * @return
     */
    @PostMapping("/adminsave.m")
    @ResponseBody
    public Map<String, Object> saveMAdmin(MAdmin mAdmin, HttpServletRequest request) {
        String mname = null;
        Map<String, Object> saveMAdmin = null;
        String pageMname = request.getParameter("mname");
        List<MAdmin> mAdmins = mAdminMapperService.mAdminList();
        for (MAdmin admin : mAdmins) {
            mname = admin.getMname();
        }
        if (!mname.equals(pageMname)) {
            saveMAdmin = mAdminMapperService.saveMAdmin(mAdmin);
        } else {
            try {
                throw new Exception("账号已经存在");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return saveMAdmin;
    }

    /**
     * 修改管理员信息
     *
     * @param mAdmin
     * @return
     */
    @PutMapping("/adminedit.m")
    @ResponseBody
    public Map<String, Object> editMAdmin(MAdmin mAdmin) {
        return mAdminMapperService.editMAdmin(mAdmin);
    }

    /**
     * 根据id删除一条管理员信息
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delMAdminById.m")
    @ResponseBody
    public Map<String, Object> delMAdminById(Integer id) {
        return mAdminMapperService.delMAdminById(id);
    }
}
