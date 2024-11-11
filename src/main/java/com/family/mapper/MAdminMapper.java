package com.family.mapper;

import com.family.pojo.MAdmin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MAdminMapper {
    MAdmin adminLogin(MAdmin mAdmin);

    List<MAdmin> mAdminList();

    Integer saveMAdmin(MAdmin mAdmin);

    Integer editMAdmin(MAdmin mAdmin);

    Integer delMAdminById(Integer id);
}
