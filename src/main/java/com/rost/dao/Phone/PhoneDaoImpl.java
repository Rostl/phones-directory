package com.rost.dao.Phone;

import com.rost.dao.BaseDaoImpl;
import com.rost.entity.Phone;

public class PhoneDaoImpl extends BaseDaoImpl<Long, Phone> implements PhoneDao {

    private static final PhoneDao INSTANCE = new PhoneDaoImpl();

    public static PhoneDao getInstance() {
        return INSTANCE;
    }

    public PhoneDaoImpl() {
        super(Phone.class);
    }

    @Override
    public Phone getByNumber(String Number) {
        return null;
    }
}
