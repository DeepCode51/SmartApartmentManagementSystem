package com.family.service.impl;

import com.family.mapper.KeepMapper;
import com.family.pojo.Keep;
import com.family.service.KeepMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class KeepMapperServiceImpl implements KeepMapperService {
    @Autowired
    private KeepMapper keepMapper;
    private Map<String,Object>map=new HashMap<>();
    @Override
    public List<Keep> keeplist() {
        return keepMapper.keeplist();
    }

    @Override
    public Map<String, Object> saveMAdmin(Keep keep) {
        Integer saveMAdmin = keepMapper.saveMAdmin(keep);
        if (saveMAdmin > 0) {
            map.put("flag", saveMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> editMAdmin(Keep keep) {
        Integer editMAdmin = keepMapper.editMAdmin(keep);
        if (editMAdmin > 0) {
            map.put("flag", editMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> delMAdminById(Integer id) {
        Integer delMAdminById = keepMapper.delMAdminById(id);
        if (delMAdminById > 0) {
            map.put("flag", delMAdminById);
        }
        return map;
    }
}
