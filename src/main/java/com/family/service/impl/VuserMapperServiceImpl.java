package com.family.service.impl;

import com.family.mapper.VuserMapper;
import com.family.pojo.Vuser;
import com.family.service.VuserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VuserMapperServiceImpl implements VuserMapperService {
    @Autowired
    private VuserMapper vuserMapper;
    private Map<String,Object>map=new HashMap<>();

    /**
     * 登录
     * @param vuser
     * @return
     */
    @Override
    public Map<String, Object> adminLogin(Vuser vuser) {
        Vuser obj = vuserMapper.adminLogin(vuser);
        if (obj != null) {
            map.put("flag", obj);
        }
        return map;
    }

    /**
     * 列表
     * @return
     */
    @Override
    public List<Vuser> mAdminList() {
        return vuserMapper.mAdminList();
    }

    /**
     * 增加
     * @param vuser
     * @return
     */
    @Override
    public Map<String, Object> saveMAdmin(Vuser vuser) {
        Integer saveMAdmin = vuserMapper.saveMAdmin(vuser);
        if (saveMAdmin > 0) {
            map.put("flag", saveMAdmin);
        }
        return map;
    }

    /**
     * 修改
     * @param vuser
     * @return
     */
    @Override
    public Map<String, Object> editMAdmin(Vuser vuser) {
        Integer editMAdmin = vuserMapper.editMAdmin(vuser);
        if (editMAdmin > 0) {
            map.put("flag", editMAdmin);
        }
        return map;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> delMAdminById(Integer id) {
        Integer delMAdminById = vuserMapper.delMAdminById(id);
        if (delMAdminById > 0) {
            map.put("flag", delMAdminById);
        }
        return map;
    }
}
