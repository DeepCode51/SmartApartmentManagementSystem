package com.family.controller;

import com.family.pojo.Keep;
import com.family.pojo.Userop;
import com.family.service.KeepMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/keep")
public class KeepController {
    @Autowired
    private KeepMapperService keepMapperService;
    private Map<String,Object>map=new HashMap<>();
    /**
     * 列表
     */
    @RequestMapping("/keeplist.m")
    @ResponseBody
    public Map<String, Object> keeplist() {
        List<Keep> adminlist = keepMapperService.keeplist();
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
     * @param keep
     * @return
     */
    @PostMapping("/keepadd.m")
    @ResponseBody
    public Map<String, Object> saveMAdmin(Keep keep, HttpServletRequest request) {
        String fap = null;
        Map<String, Object> saveMAdmin = null;
        String pageMname = request.getParameter("fap");
        List<Keep> mAdmins = keepMapperService.keeplist();
        for (Keep admin : mAdmins) {
            fap = admin.getFap();
        }
        if (!fap.equals(pageMname)) {
            saveMAdmin = keepMapperService.saveMAdmin(keep);
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
     * @param keep
     * @return
     */
    @PutMapping("/keepedit.m")
    @ResponseBody
    public Map<String, Object> editMAdmin(Keep keep) {
        return keepMapperService.editMAdmin(keep);
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
        return keepMapperService.delMAdminById(id);
    }
}
