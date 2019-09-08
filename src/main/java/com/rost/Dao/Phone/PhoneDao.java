package com.rost.Dao.Phone;

import com.rost.Dao.BaseDao;
import com.rost.entity.Phone;

public interface PhoneDao extends BaseDao<Long, Phone> {

    Phone getByNumber(String Number);
}
