package com.family.service;

import com.family.pojo.Oop;

import java.util.List;
import java.util.Map;

public interface OopMapperService {
    List<Oop> keeplist();

    Map<String, Object> saveMAdmin(Oop oop);

    Map<String, Object> editMAdmin(Oop oop);

    Map<String, Object> delMAdminById(Integer id);

}
