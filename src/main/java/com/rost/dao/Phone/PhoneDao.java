package com.rost.dao.Phone;

import com.rost.dao.BaseDao;
import com.rost.entity.Phone;

public interface PhoneDao extends BaseDao<Long, Phone> {

    Phone getByNumber(String Number);
}
