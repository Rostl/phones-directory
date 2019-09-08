package com.rost.entity;

import com.rost.Dao.Employee.EmployeeDao;
import com.rost.Dao.Employee.EmployeeDaoImpl;
import com.rost.Dao.EmployeeDepartment.EmployeeDepartmentDao;
import com.rost.Dao.EmployeeDepartment.EmployeeDepartmentDaoImpl;
import com.rost.util.ConnectionManager;
import com.rost.util.EmployeeTestDataImporter;
import lombok.Cleanup;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

import static com.rost.entity.Phone_.employee;

public class Runner {
    public static void main(String[] args) {

        //После первого запуска параметр hbm2ddl.auto - create в hibernate.cfg изменить на - validate
       /* @Cleanup SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        EmployeeTestDataImporter.getInstance().importTestData(sessionFactory);*/

        EmployeeDao instatce = EmployeeDaoImpl.getInstatce();

        //Поиск по id
        List<Employee> employee = instatce.findByFirstName("Alex");

        //Поиск всех employee
       /* List<Employee> all = instatce.findAll();*/
        for (Employee employee1 : employee
        ) {
            System.out.println(employee1);

        }

       /* System.out.println(employee);*/
        ConnectionManager.getFactory().close();
    }
}
