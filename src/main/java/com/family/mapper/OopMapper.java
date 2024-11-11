package com.family.mapper;

import com.family.pojo.Oop;

import java.util.List;

public interface OopMapper {
    List<Oop> keeplist();

    Integer saveMAdmin(Oop oop);

    Integer editMAdmin(Oop oop);

    Integer delMAdminById(Integer id);
}
