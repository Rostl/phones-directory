package com.rost.dao.EmployeeDepartment;

import com.rost.dao.BaseDao;
import com.rost.entity.EmployeeDepartment;

public interface EmployeeDepartmentDao extends BaseDao<Long, EmployeeDepartment> {

    EmployeeDepartment findByDepartnent(String name);
}
