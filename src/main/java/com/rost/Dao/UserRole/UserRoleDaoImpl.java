package com.rost.Dao.UserRole;

import com.rost.Dao.BaseDaoImpl;
import com.rost.entity.Role;
import com.rost.entity.UserRole;

public class UserRoleDaoImpl extends BaseDaoImpl<Long, UserRole> implements UserRoleDao {

    private static final UserRoleDao INSTANCE = new UserRoleDaoImpl();

    public static UserRoleDao getInstance() {
        return INSTANCE;
    }

    public UserRoleDaoImpl() {
        super(UserRole.class);
    }

    @Override
    public UserRole findByRole(Role role) {
        return null;
    }
}
