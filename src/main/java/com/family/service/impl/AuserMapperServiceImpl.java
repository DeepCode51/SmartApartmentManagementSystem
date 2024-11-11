package com.family.service.impl;

import com.family.mapper.AuserMapper;
import com.family.pojo.Auser;
import com.family.service.AuserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class AuserMapperServiceImpl implements AuserMapperService {
    @Autowired
    private AuserMapper auserMapper;
    private Map<String,Object> map=new HashMap<>();
    @Override
    public List<Auser> keeplist() {
        return auserMapper.keeplist();
    }

    @Override
    public Map<String, Object> saveMAdmin(Auser auser) {
        Integer saveMAdmin = auserMapper.saveMAdmin(auser);
        if (saveMAdmin > 0) {
            map.put("flag", saveMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> editMAdmin(Auser auser) {
        Integer editMAdmin = auserMapper.editMAdmin(auser);
        if (editMAdmin > 0) {
            map.put("flag", editMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> delMAdminById(Integer id) {
        Integer delMAdminById = auserMapper.delMAdminById(id);
        if (delMAdminById > 0) {
            map.put("flag", delMAdminById);
        }
        return map;
    }
}
