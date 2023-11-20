package com.faroukdev.kwasudemologin.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentid;

    @Column(name = "matric_no", length = 255)
    private String MatricNumber;

    @Column(name = "student_name", length = 255)
    private String studentname;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "program", length = 255)
    private String program;

    @Column(name = "password", length = 255)
    private String password;

}
