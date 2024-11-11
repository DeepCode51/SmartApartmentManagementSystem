package com.family.service.impl;

import com.family.mapper.MAdminMapper;
import com.family.pojo.MAdmin;
import com.family.service.MAdminMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MAdminMapperServiceImpl implements MAdminMapperService {
    @Autowired
    private MAdminMapper mAdminMapper;
    private Map<String, Object> map = new HashMap<>();

    /**
     * 后台管理员登录
     *
     * @param mAdmin
     * @return
     */
    @Override
    public Map<String, Object> adminLogin(MAdmin mAdmin) {
        MAdmin obj = mAdminMapper.adminLogin(mAdmin);
        if (obj != null) {
            map.put("flag", obj);
        }
        return map;
    }

    /**
     * 管理员列表
     *
     * @return
     */
    @Override
    public List<MAdmin> mAdminList() {
        return mAdminMapper.mAdminList();
    }

    /**
     * 管理员增加
     *
     * @param mAdmin
     * @return
     */
    @Override
    public Map<String, Object> saveMAdmin(MAdmin mAdmin) {
        Integer saveMAdmin = mAdminMapper.saveMAdmin(mAdmin);
        if (saveMAdmin > 0) {
            map.put("flag", saveMAdmin);
        }
        return map;
    }

    /**
     * 管理员修改
     *
     * @param mAdmin
     * @return
     */
    @Override
    public Map<String, Object> editMAdmin(MAdmin mAdmin) {
        Integer editMAdmin = mAdminMapper.editMAdmin(mAdmin);
        if (editMAdmin > 0) {
            map.put("flag", editMAdmin);
        }
        return map;
    }

    /**
     * 管理员删除
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> delMAdminById(Integer id) {
        Integer delMAdminById = mAdminMapper.delMAdminById(id);
        if (delMAdminById > 0) {
            map.put("flag", delMAdminById);
        }
        return map;
    }
}
