package com.itheima.ms.po.dao.Impl;

import com.itheima.ms.po.User;
import com.itheima.ms.po.dao.BaseDao;
import com.itheima.ms.po.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User findByUserId(int i) {
        return this.getSqlSession().selectOne("test.findByUserId",i);
    }
}
