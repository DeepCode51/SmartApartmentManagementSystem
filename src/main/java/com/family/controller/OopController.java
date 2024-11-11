package com.family.controller;

import com.family.pojo.Oop;
import com.family.service.OopMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/oop")
public class OopController {
    @Autowired
    private OopMapperService oopMapperService;
    private Map<String,Object> map=new HashMap<>();
    /**
     * 列表
     */
    @RequestMapping("/ooplist.m")
    @ResponseBody
    public Map<String, Object> keeplist() {
        List<Oop> adminlist = oopMapperService.keeplist();
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
     * @param oop
     * @return
     */
    @PostMapping("/oopadd.m")
    @ResponseBody
    public Map<String, Object> saveMAdmin(Oop oop, HttpServletRequest request) {
        String names = null;
        Map<String, Object> saveMAdmin = null;
        String pageMname = request.getParameter("names");
        List<Oop> mAdmins = oopMapperService.keeplist();
        for (Oop admin : mAdmins) {
            names = admin.getNames();
        }
        if (!names.equals(pageMname)) {
            saveMAdmin = oopMapperService.saveMAdmin(oop);
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
     * @param oop
     * @return
     */
    @PutMapping("/oopedit.m")
    @ResponseBody
    public Map<String, Object> editMAdmin(Oop oop) {
        return oopMapperService.editMAdmin(oop);
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
        return oopMapperService.delMAdminById(id);
    }
}
