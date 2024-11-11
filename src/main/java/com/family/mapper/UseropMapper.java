package com.family.mapper;

import com.family.pojo.Userop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UseropMapper {
    List<Userop> keeplist();

    Integer saveMAdmin(Userop userop);

    Integer editMAdmin(Userop userop);

    Integer delMAdminById(Integer id);

}
