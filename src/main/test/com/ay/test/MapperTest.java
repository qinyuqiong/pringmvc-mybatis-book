package com.ay.test;

import com.ay.dao.DepartmentMapper;
import com.ay.dao.EmployeeMapper;
import com.ay.model.Department;
import com.ay.model.Employee;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.parsing.SourceExtractor;

import java.util.UUID;

/**
 * 测试dao层
 */
public class MapperTest extends BaseJuint4Test{
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD(){
        System.out.println(employeeMapper);
        //1.插入几个部门
       // departmentMapper.insertSelective(new Department(2,"开发部"));
       // departmentMapper.insertSelective(new Department(3,"测试部"));
        //2.生成员工数据，测试员工插入
        //employeeMapper.insertSelective(new Employee(2,"jerry","M","jerry@atguigu.com",1));
        //3.批量插入多个员工，批量，使用可以执行批量操作的sqlsession

//        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        for (int i = 0;i<1000;i++){
//            String uid = UUID.randomUUID().toString().substring(0, 5)+i;
//            mapper.insertSelective(new Employee(i,uid,"M",uid+"@atgiugu.com",1));
//        }
//        System.out.println("批量插入完成");

    }
}