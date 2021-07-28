package com.it.mapper;

import com.it.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {
        User user = new User(7,"你好","ok");
        addUser(user);
        deleteUser(6);
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

    public int addUser(User user) {
        return  getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return  getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
