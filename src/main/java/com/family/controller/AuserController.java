package com.family.controller;

import com.family.pojo.Auser;
import com.family.service.AuserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/auser")
public class AuserController {
    @Autowired
    private AuserMapperService auserMapperService;
    private Map<String,Object>map=new HashMap<>();
    /**
     * 列表
     */
    @RequestMapping("/keylist.m")
    @ResponseBody
    public Map<String, Object> keeplist() {
        List<Auser> adminlist = auserMapperService.keeplist();
        if (adminlist != null) {
            map.put("code", 0);
            map.put("msg", "");
            map.put("count", adminlist.size());
            map.put("data", adminlist);
        }
        return map;
    }

    /**
     * 添加
     *
     * @param auser
     * @return
     */
    @PostMapping("/keyadd.m")
    @ResponseBody
    public Map<String, Object> saveMAdmin(Auser auser, HttpServletRequest request) {
        String useradd = null;
        Map<String, Object> saveMAdmin = null;
        String pageMname = request.getParameter("useradd");
        List<Auser> mAdmins = auserMapperService.keeplist();
        for (Auser admin : mAdmins) {
            useradd = admin.getUseradd();
        }
        if (!useradd.equals(pageMname)) {
            saveMAdmin = auserMapperService.saveMAdmin(auser);
        } else {
            try {
                throw new Exception("已经存在");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return saveMAdmin;
    }
    /**
     * 修改
     *
     * @param auser
     * @return
     */
    @PutMapping("/keyedit.m")
    @ResponseBody
    public Map<String, Object> editMAdmin(Auser auser) {
        return auserMapperService.editMAdmin(auser);
    }
    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delMAdminById.m")
    @ResponseBody
    public Map<String, Object> delMAdminById(Integer id) {
        return auserMapperService.delMAdminById(id);
    }
}
