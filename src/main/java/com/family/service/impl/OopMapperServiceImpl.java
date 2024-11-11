package com.family.service.impl;

import com.family.mapper.OopMapper;
import com.family.pojo.Oop;
import com.family.service.OopMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class OopMapperServiceImpl implements OopMapperService {
    @Autowired
    private OopMapper oopMapper;
    private Map<String,Object> map=new HashMap<>();
    @Override
    public List<Oop> keeplist() {
        return oopMapper.keeplist();
    }

    @Override
    public Map<String, Object> saveMAdmin(Oop oop) {
        Integer saveMAdmin = oopMapper.saveMAdmin(oop);
        if (saveMAdmin > 0) {
            map.put("flag", saveMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> editMAdmin(Oop oop) {
        Integer editMAdmin = oopMapper.editMAdmin(oop);
        if (editMAdmin > 0) {
            map.put("flag", editMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> delMAdminById(Integer id) {
        Integer delMAdminById = oopMapper.delMAdminById(id);
        if (delMAdminById > 0) {
            map.put("flag", delMAdminById);
        }
        return map;
    }
}
