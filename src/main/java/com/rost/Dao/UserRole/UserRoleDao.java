package com.rost.Dao.UserRole;

import com.rost.Dao.BaseDao;
import com.rost.entity.Role;
import com.rost.entity.UserRole;

public interface UserRoleDao extends BaseDao<Long, UserRole> {

    UserRole findByRole(Role role);
}
