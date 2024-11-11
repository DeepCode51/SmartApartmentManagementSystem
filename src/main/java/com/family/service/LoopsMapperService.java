package com.family.service;

import com.family.pojo.Loops;

import java.util.List;
import java.util.Map;

public interface LoopsMapperService {
    List<Loops> keeplist();

    Map<String, Object> saveMAdmin(Loops loops);

    Map<String, Object> editMAdmin(Loops loops);

    Map<String, Object> delMAdminById(Integer id);
}
