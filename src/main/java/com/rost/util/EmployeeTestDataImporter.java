package com.rost.util;

import com.rost.entity.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeTestDataImporter {

    public static EmployeeTestDataImporter INSTANCE = new EmployeeTestDataImporter();

    public static EmployeeTestDataImporter getInstance() {
        return INSTANCE;
    }

    public void importTestData(SessionFactory sessionFactory) {
        try (Session session = sessionFactory.openSession()) {

            EmployeeDepartment account = saveEmployeeDepartment(session, "Account");
            EmployeeDepartment it = saveEmployeeDepartment(session, "IT");
            EmployeeDepartment lawyers = saveEmployeeDepartment(session, "Lawyers");
            EmployeeDepartment hr = saveEmployeeDepartment(session, "HR");

            Employee alex = saveEmployee(session, "Alex", "Ivanov", "Ivanovich", Gender.MALE,
                    LocalDate.of(1968, 5, 15), it);
            Employee boris = saveEmployee(session, "Boris", "Ezhov", "Vladimirovich", Gender.MALE,
                    LocalDate.of(1997, 11, 02), it);
            Employee ilona = saveEmployee(session, "Ilona", "Menshova", "Nikolaevna", Gender.FAMALE,
                    LocalDate.of(1999, 7, 21), lawyers);
            Employee elena = saveEmployee(session, "elena", "Komash", "Vasilevna", Gender.FAMALE,
                    LocalDate.of(1986, 2, 06), hr);
            Employee anton = saveEmployee(session, "Artem", "Volodko", "Dmitrevich", Gender.MALE,
                    LocalDate.of(1989, 8, 07), account);

            savePhone(session, "+375 44", "356-24-78", alex);
            savePhone(session, "+375 33", "275-65-96", alex);

            savePhone(session, "+375 29", "646-04-24", boris);

            savePhone(session, "+375 44", "323-03-33", ilona);
            savePhone(session, "+375 17", "291-21-36", ilona);
            savePhone(session, "+375 29", "378-71-66", elena);
            savePhone(session, "+375 15", "829-44-34", anton);

            saveUserRole(session, Role.user, "yaBoris","54321", boris);
            saveUserRole(session, Role.user,"yaIlona", "54321", ilona);
            saveUserRole(session, Role.user, "Lena","54321", elena);
            saveUserRole(session, Role.admin,"Alexxx", "12345", alex);
            saveUserRole(session, Role.user,"ToXa", "54321", anton);
        }
    }

    private UserRole saveUserRole(Session session, Role role, String login, String password, Employee employee) {
        UserRole userRole1 = new UserRole(role, login, password, employee);
        session.save(userRole1);

        return userRole1;
    }

    private Phone savePhone(Session session, String code, String phoneNumber, Employee employee) {
        Phone phone = new Phone(code, phoneNumber, employee);
        session.save(phone);

        return phone;
    }

    private Employee saveEmployee(Session session, String firstName, String secondName, String patronymicBName, Gender gender, LocalDate birthday, EmployeeDepartment employeeDepartment) {
        Employee employee = new Employee(firstName, secondName, patronymicBName, gender, birthday, employeeDepartment);
        session.save(employee);

        return employee;
    }

    private EmployeeDepartment saveEmployeeDepartment(Session session, String name) {
        EmployeeDepartment employeeDepartment = new EmployeeDepartment(name);
        session.save(employeeDepartment);

        return employeeDepartment;
    }
}




