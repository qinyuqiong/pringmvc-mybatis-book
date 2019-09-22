package com.ay.test;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    @Test
    public void testPageHelper(){
        PageHelper.startPage(0,1);
        List<AyUser> userList = ayUserDao.findAll();
        PageInfo pageInfo = new PageInfo(userList);
        System.out.println(pageInfo);
    }
}
