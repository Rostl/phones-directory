package com.rost.dao.EmployeeDepartment;

import com.rost.dao.BaseDaoImpl;
import com.rost.entity.EmployeeDepartment;

public class EmployeeDepartmentDaoImpl extends BaseDaoImpl<Long, EmployeeDepartment> implements EmployeeDepartmentDao {

    private static final EmployeeDepartmentDao INSTANCE = new EmployeeDepartmentDaoImpl();

    public static EmployeeDepartmentDao getInstance() {
        return INSTANCE;
    }

    public EmployeeDepartmentDaoImpl() {
        super(EmployeeDepartment.class);
    }

    @Override
    public EmployeeDepartment findByDepartnent(String name) {
        return null;
    }
}
