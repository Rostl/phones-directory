package com.rost.Dao.Employee;

import com.rost.Dao.BaseDao;
import com.rost.entity.Employee;

import java.util.List;

public interface EmployeeDao extends BaseDao<Long, Employee> {

    List<Employee> findByFirstName(String firstName);
}
