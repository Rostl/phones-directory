package com.rost.Dao.EmployeeDepartment;

import com.rost.Dao.BaseDao;
import com.rost.entity.EmployeeDepartment;

public interface EmployeeDepartmentDao extends BaseDao<Long, EmployeeDepartment> {

    EmployeeDepartment findByDepartnent(String name);
}
