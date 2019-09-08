package com.rost.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(exclude = "employeeRole")
@Builder
@Entity
@Table(name = "user_role", schema = "phone_storage")
public class UserRole extends BaseEntity<Long> {

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employeeRole;

}
