package com.family.mapper;

import com.family.pojo.Keep;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface KeepMapper {
    List<Keep> keeplist();

    Integer saveMAdmin(Keep keep);

    Integer editMAdmin(Keep keep);

    Integer delMAdminById(Integer id);

}
