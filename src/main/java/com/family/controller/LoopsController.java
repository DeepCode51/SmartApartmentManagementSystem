package com.family.controller;

import com.family.pojo.Loops;
import com.family.service.LoopsMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/loop")
public class LoopsController {
    @Autowired
    private LoopsMapperService loopMapperService;
    private Map<String,Object>map=new HashMap<>();
    /**
     * 列表
     */
    @RequestMapping("/loopslist.m")
    @ResponseBody
    public Map<String, Object> keeplist() {
        List<Loops> adminlist = loopMapperService.keeplist();
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
     * @param loops
     * @return
     */
    @PostMapping("/loppsadd.m")
    @ResponseBody
    public Map<String, Object> saveMAdmin(Loops loops, HttpServletRequest request) {
        String tuisu = null;
        Map<String, Object> saveMAdmin = null;
        String pageMname = request.getParameter("tuisu");
        List<Loops> mAdmins = loopMapperService.keeplist();
        for (Loops admin : mAdmins) {
            tuisu = admin.getTuisu();
        }
        if (!tuisu.equals(pageMname)) {
            saveMAdmin = loopMapperService.saveMAdmin(loops);
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
     * @param loops
     * @return
     */
    @PutMapping("/loopsedit.m")
    @ResponseBody
    public Map<String, Object> editMAdmin(Loops loops) {
        return loopMapperService.editMAdmin(loops);
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
        return loopMapperService.delMAdminById(id);
    }
}
