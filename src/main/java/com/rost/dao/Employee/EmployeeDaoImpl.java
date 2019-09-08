package com.rost.dao.Employee;

import com.rost.dao.BaseDaoImpl;
import com.rost.entity.Employee;
import com.rost.entity.Employee_;
import com.rost.util.ConnectionManager;
import lombok.Cleanup;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EmployeeDaoImpl extends BaseDaoImpl<Long, Employee> implements EmployeeDao {

    private static final EmployeeDao INSTANCE = new EmployeeDaoImpl();

    public static EmployeeDao getInstatce() {
        return INSTANCE;
    }

    public EmployeeDaoImpl() {
        super(Employee.class);
    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        @Cleanup Session session = ConnectionManager.getSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Employee> criteria = cb.createQuery(Employee.class);
        Root<Employee> root = criteria.from(Employee.class);
        criteria.select(root).where(
                cb.equal(root.get(Employee_.FIRST_NAME), firstName));
        return session.createQuery(criteria).list();
    }
}
