package com.family.service.impl;

import com.family.mapper.LoopsMapper;
import com.family.pojo.Loops;
import com.family.service.LoopsMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoopsMapperServiceImpl implements LoopsMapperService {
    @Autowired
    private LoopsMapper loopMapper;
    private Map<String,Object> map=new HashMap<>();

    @Override
    public List<Loops> keeplist() {
        return loopMapper.keeplist();
    }

    @Override
    public Map<String, Object> saveMAdmin(Loops loops) {
        Integer saveMAdmin = loopMapper.saveMAdmin(loops);
        if (saveMAdmin > 0) {
            map.put("flag", saveMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> editMAdmin(Loops loops) {
        Integer editMAdmin = loopMapper.editMAdmin(loops);
        if (editMAdmin > 0) {
            map.put("flag", editMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> delMAdminById(Integer id) {
        Integer delMAdminById = loopMapper.delMAdminById(id);
        if (delMAdminById > 0) {
            map.put("flag", delMAdminById);
        }
        return map;
    }
}
