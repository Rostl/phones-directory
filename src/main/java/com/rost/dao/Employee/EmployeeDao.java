package com.rost.dao.Employee;

import com.rost.dao.BaseDao;
import com.rost.entity.Employee;

import java.util.List;

public interface EmployeeDao extends BaseDao<Long, Employee> {

    List<Employee> findByFirstName(String firstName);
}
