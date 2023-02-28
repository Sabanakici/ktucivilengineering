package com.saban.akici.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "STUDENTS")
@Data
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @OneToMany(targetEntity = Lesson.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "student",referencedColumnName = "id")
    private List<Lesson> lessons;
}
