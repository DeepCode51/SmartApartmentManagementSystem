package com.family.mapper;

import com.family.pojo.Auser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuserMapper {
    List<Auser> keeplist();

    Integer saveMAdmin(Auser auser);

    Integer editMAdmin(Auser auser);

    Integer delMAdminById(Integer id);
}
