package com.family.service.impl;

import com.family.mapper.UseropMapper;
import com.family.pojo.Userop;
import com.family.service.UseropMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class UseropMapperServiceImpl implements UseropMapperService {
    @Autowired
    private UseropMapper useropMapper;
    private Map<String,Object> map=new HashMap<>();
    @Override
    public List<Userop> keeplist() {
        return useropMapper.keeplist();
    }

    @Override
    public Map<String, Object> saveMAdmin(Userop userop) {
        Integer saveMAdmin = useropMapper.saveMAdmin(userop);
        if (saveMAdmin > 0) {
            map.put("flag", saveMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> editMAdmin(Userop userop) {
        Integer editMAdmin = useropMapper.editMAdmin(userop);
        if (editMAdmin > 0) {
            map.put("flag", editMAdmin);
        }
        return map;
    }

    @Override
    public Map<String, Object> delMAdminById(Integer id) {
        Integer delMAdminById = useropMapper.delMAdminById(id);
        if (delMAdminById > 0) {
            map.put("flag", delMAdminById);
        }
        return map;
    }
}
