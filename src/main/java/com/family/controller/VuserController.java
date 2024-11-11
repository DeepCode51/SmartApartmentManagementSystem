package com.family.controller;

import com.family.pojo.Vuser;
import com.family.service.VuserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/vuser")
public class VuserController {
    @Autowired
    private VuserMapperService vuserMapperService;
    private Map<String,Object>map=new HashMap<>();
    /**
     * 用户登录
     *
     * @param vuser
     * @param request
     * @return
     */
    @RequestMapping("/vivelogin.m")
    @ResponseBody
    public Map<String, Object> adminLogin(Vuser vuser, HttpServletRequest request) {
        Map<String, Object> admin = vuserMapperService.adminLogin(vuser);
        if (admin != null) {
            request.getSession().setAttribute("Vuser", admin);
            request.getSession().setAttribute("names", vuser.getNames());
        }
        return admin;
    }
    /**
     * 用户退出登录
     *
     * @param session
     * @return
     */
    @RequestMapping("/signOut")
    @ResponseBody
    public Map<String, Object> signOut(HttpSession session) {
        session.removeAttribute("Vuser");
        session.removeAttribute("names");
        map.put("signOut", "signOut");
        return map;
    }
    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping("/userelist.m")
    @ResponseBody
    public Map<String, Object> mAdminList() {
        List<Vuser> mAdmins = vuserMapperService.mAdminList();
        if (mAdmins != null) {
            map.put("code", 0);
            map.put("msg", "");
            map.put("count", mAdmins.size());
            map.put("data", mAdmins);
        }
        return map;
    }
    /**
     * 添加信息
     *
     * @param vuser
     * @return
     */
    @PostMapping("/usersave.m")
    @ResponseBody
    public Map<String, Object> saveMAdmin(Vuser vuser, HttpServletRequest request) {
        String names = null;
        Map<String, Object> saveMAdmin = null;
        String pageMname = request.getParameter("names");
        List<Vuser> mAdmins = vuserMapperService.mAdminList();
        for (Vuser admin : mAdmins) {
            names = admin.getNames();
        }
        if (!names.equals(pageMname)) {
            saveMAdmin = vuserMapperService.saveMAdmin(vuser);
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
     * 修改信息
     *
     * @param vuser
     * @return
     */
    @PutMapping("/useredit.m")
    @ResponseBody
    public Map<String, Object> editMAdmin(Vuser vuser) {
        return vuserMapperService.editMAdmin(vuser);
    }
    /**
     * 根据id删除信息
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delMAdminById.m")
    @ResponseBody
    public Map<String, Object> delMAdminById(Integer id) {
        return vuserMapperService.delMAdminById(id);
    }
}
