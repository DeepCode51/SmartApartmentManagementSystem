package com.family.controller;

import com.family.pojo.Userop;
import com.family.service.UseropMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userop")
public class UseropController {
    @Autowired
    private UseropMapperService useropMapperService;
    private Map<String,Object>map=new HashMap<>();
    /**
     * 列表
     */
    @RequestMapping("/userlist.m")
    @ResponseBody
    public Map<String, Object> keeplist() {
        List<Userop> adminlist = useropMapperService.keeplist();
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
     * @param userop
     * @return
     */
    @PostMapping("/useradd.m")
    @ResponseBody
    public Map<String, Object> saveMAdmin(Userop userop, HttpServletRequest request) {
        String zhichu = null;
        Map<String, Object> saveMAdmin = null;
        String pageMname = request.getParameter("zhichu");
        List<Userop> mAdmins = useropMapperService.keeplist();
        for (Userop admin : mAdmins) {
            zhichu = admin.getZhichu();
        }
        if (!zhichu.equals(pageMname)) {
            saveMAdmin = useropMapperService.saveMAdmin(userop);
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
     * @param userop
     * @return
     */
    @PutMapping("/userdit.m")
    @ResponseBody
    public Map<String, Object> editMAdmin(Userop userop) {
        return useropMapperService.editMAdmin(userop);
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
        return useropMapperService.delMAdminById(id);
    }
}
