package com.faroukdev.kwasudemologin.Service;

import com.faroukdev.kwasudemologin.Dto.LoginDTO;
import com.faroukdev.kwasudemologin.Dto.StudentDTO;
import com.faroukdev.kwasudemologin.Response.LoginResponse;


public interface StudentService {


    String addStudent(StudentDTO studentDTO);

    LoginResponse loginStudent(LoginDTO loginDTO);

}
