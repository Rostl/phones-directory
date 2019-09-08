package com.rost.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@ToString(exclude = "phones")
@Data
@Builder
@Entity
@Table(name = "employee", schema = "phone_storage")
public class Employee extends BaseEntity<Long> {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "patronynic_name")
    private String patronymicName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "birthday")
    private LocalDate birthday;

    @ManyToOne
    @JoinColumn(name = "employee_department_id")
    private EmployeeDepartment employeeDepartment;

    @OneToMany(mappedBy = "employee")
    private List<Phone> phones;

    @OneToOne(mappedBy = "employeeRole")
    private UserRole userRole;

    public Employee(String firstName, String lastName, String patronymicName, Gender gender, LocalDate birthday, EmployeeDepartment employeeDepartment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.gender = gender;
        this.birthday = birthday;
        this.employeeDepartment = employeeDepartment;
    }
}
