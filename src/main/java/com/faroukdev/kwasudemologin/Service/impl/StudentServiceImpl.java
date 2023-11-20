package com.faroukdev.kwasudemologin.Service.impl;

import com.faroukdev.kwasudemologin.Dto.LoginDTO;
import com.faroukdev.kwasudemologin.Dto.StudentDTO;
import com.faroukdev.kwasudemologin.Entity.Student;
import com.faroukdev.kwasudemologin.Repo.StudentRepo;
import com.faroukdev.kwasudemologin.Response.LoginResponse;
import com.faroukdev.kwasudemologin.Service.StudentService;
import com.faroukdev.kwasudemologin.Utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addStudent(StudentDTO studentDTO) {

        /**
         * Creating an account - saving a new user into the db
         * check if the user already has an account
         */

        if (studentRepo.existsByEmail(studentDTO.getEmail())) {
            return AccountUtils.ACCOUNT_EXISTS_MESSAGE;
        }


        if (studentDTO.getProgram().equals(AccountUtils.REGULAR_STRING)) {

            Student student = Student.builder()
                .MatricNumber(AccountUtils.generateRegularMatricNumber("cs"))
                .studentname(studentDTO.getStudentname())
                .email(studentDTO.getEmail())
                .program(studentDTO.getProgram())
                .password(passwordEncoder.encode(studentDTO.getPassword()))
                .build();
            studentRepo.save(student);

            return AccountUtils.ACCOUNT_CREATED;
        }

        if (studentDTO.getProgram().equals(AccountUtils.IDEL_STRING)) {

            Student student = Student.builder()
                .MatricNumber(AccountUtils.generateIdelMatricNumber("xcs"))
                .studentname(studentDTO.getStudentname())
                .email(studentDTO.getEmail())
                .program(studentDTO.getProgram())
                .password(passwordEncoder.encode(studentDTO.getPassword()))
                .build();
            studentRepo.save(student);

            return AccountUtils.ACCOUNT_CREATED;
        }

        if (studentDTO.getProgram().equals(AccountUtils.PDP_STRING)) {

            Student student = Student.builder()
                .MatricNumber(AccountUtils.generatePdpMatricNumber("7cs"))
                .studentname(studentDTO.getStudentname())
                .email(studentDTO.getEmail())
                .program(studentDTO.getProgram())
                .password(passwordEncoder.encode(studentDTO.getPassword()))
                .build();
            studentRepo.save(student);

            return AccountUtils.ACCOUNT_CREATED;
        }
        return AccountUtils.INVALID_STRING;
    }


    @Override
    public LoginResponse loginStudent(LoginDTO loginDTO) {

        // String msg = "";
        Student student1 = studentRepo.findByEmail(loginDTO.getEmail());
        if (student1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = student1.getPassword();
            boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);

            if (isPwdRight) {
                Optional<Student> student = studentRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (student.isPresent()) {
                    return new LoginResponse("Login Success", true);
                }
                else {
                    return new LoginResponse("Login Failed", false);
                }
            }
            else {
                return new LoginResponse("password Not Match", false);
            }
        }
        else {
            return new LoginResponse("Email does not exist", false);
        }

    }
}
