package com.faroukdev.kwasudemologin.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private int studentid;
    private String MatricNumber;
    private String studentname;
    private String email;
    private String program;
    private String password;

}
