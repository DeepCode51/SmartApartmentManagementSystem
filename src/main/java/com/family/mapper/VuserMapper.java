package com.family.mapper;

import com.family.pojo.Vuser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VuserMapper {
    Vuser adminLogin(Vuser vuser);

    List<Vuser> mAdminList();

    Integer saveMAdmin(Vuser vuser);

    Integer editMAdmin(Vuser vuser);

    Integer delMAdminById(Integer id);

}
