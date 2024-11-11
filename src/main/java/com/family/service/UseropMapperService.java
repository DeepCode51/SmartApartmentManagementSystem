package com.family.service;

import com.family.pojo.Userop;

import java.util.List;
import java.util.Map;

public interface UseropMapperService {
    List<Userop> keeplist();

    Map<String, Object> saveMAdmin(Userop userop);

    Map<String, Object> editMAdmin(Userop userop);

    Map<String, Object> delMAdminById(Integer id);

}
