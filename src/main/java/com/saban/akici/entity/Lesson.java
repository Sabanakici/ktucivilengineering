package com.saban.akici.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LESSONS")
@Data
public class Lesson implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lid;
    private String lessonName;
    private Long grade;
    private Long credit;
}
