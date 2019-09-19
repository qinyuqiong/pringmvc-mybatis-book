package com.ay.test;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class AyUserDaoTest extends BaseJuint4Test {
    @Resource
    private AyUserDao ayUserDao;
    @Test
    public void testFindAll(){
        List<AyUser> userList = ayUserDao.findAll();
        System.out.println(userList.size());
    }
}
