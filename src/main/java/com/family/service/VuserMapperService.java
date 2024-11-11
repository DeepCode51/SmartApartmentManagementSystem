package com.family.service;

import com.family.pojo.Vuser;

import java.util.List;
import java.util.Map;

public interface VuserMapperService {
    Map<String, Object> adminLogin(Vuser vuser);

    List<Vuser> mAdminList();

    Map<String, Object> saveMAdmin(Vuser vuser);

    Map<String, Object> editMAdmin(Vuser vuser);

    Map<String, Object> delMAdminById(Integer id);
}
