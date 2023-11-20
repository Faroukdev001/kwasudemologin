package com.faroukdev.kwasudemologin.StudentController;

import com.faroukdev.kwasudemologin.Dto.LoginDTO;
import com.faroukdev.kwasudemologin.Dto.StudentDTO;
import com.faroukdev.kwasudemologin.Response.LoginResponse;
import com.faroukdev.kwasudemologin.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/save")
    public String saveStudent(@RequestBody StudentDTO studentDTO){
        String id = studentService.addStudent(studentDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginStudent(@RequestBody LoginDTO loginDTO) {
        LoginResponse loginResponse = studentService.loginStudent(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }






}
