package com.rost.dao.UserRole;

import com.rost.dao.BaseDao;
import com.rost.entity.Role;
import com.rost.entity.UserRole;

public interface UserRoleDao extends BaseDao<Long, UserRole> {

    UserRole findByRole(Role role);
}
