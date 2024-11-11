package com.family.service;

import com.family.pojo.Auser;

import java.util.List;
import java.util.Map;

public interface AuserMapperService {
    List<Auser> keeplist();

    Map<String, Object> saveMAdmin(Auser auser);

    Map<String, Object> editMAdmin(Auser auser);

    Map<String, Object> delMAdminById(Integer id);

}
