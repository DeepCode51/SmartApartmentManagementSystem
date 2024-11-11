package com.family.mapper;

import com.family.pojo.Loops;

import java.util.List;

public interface LoopsMapper {
    List<Loops> keeplist();

    Integer saveMAdmin(Loops loops);

    Integer editMAdmin(Loops loops);

    Integer delMAdminById(Integer id);

}
