package com.rost.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "employee")
@Data
@Builder
@Entity
@Table(name = "phone", schema = "phone_storage")
public class Phone extends BaseEntity<Long> {

    @Column(name = "code")
    private String code;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
