package com.family.service;

import com.family.pojo.Keep;

import java.util.List;
import java.util.Map;

public interface KeepMapperService {
    List<Keep> keeplist();

    Map<String, Object> saveMAdmin(Keep keep);

    Map<String, Object> editMAdmin(Keep keep);

    Map<String, Object> delMAdminById(Integer id);

}
