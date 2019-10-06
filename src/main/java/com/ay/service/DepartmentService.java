package com.ay.service;

import com.ay.dao.DepartmentMapper;
import com.ay.dao.EmployeeMapper;
import com.ay.model.Department;
import com.ay.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: yuqiong
 * @createDate: 2019/10/6
 * @version: 1.0
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getDepts(){
        List<Department> list = departmentMapper.selectByExample(null);
        return list;
    }

}
