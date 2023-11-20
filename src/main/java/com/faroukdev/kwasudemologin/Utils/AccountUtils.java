package com.faroukdev.kwasudemologin.Utils;

import org.springframework.stereotype.Component;

import com.faroukdev.kwasudemologin.Dto.StudentDTO;

import java.util.Calendar;


@Component
public class AccountUtils {

    public static StudentDTO studentDTO;

    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created";
    public static final String ACCOUNT_CREATED = "Your Account has successfully been created";
    public static final String INVALID_STRING = "The program selected does not exist";
    public static final String REGULAR_STRING = "REGULAR";
    public static final String IDEL_STRING = "IDEL";
    public static final String PDP_STRING = "PDP";




//    @Autowired
//    private static CounterRepo counterRepo;
//    private static final AtomicInteger counter = new AtomicInteger(1);

    public static String generateRegularMatricNumber(String departmentCodeReg) {
        int year = Calendar.getInstance().get(Calendar.YEAR) % 100;
//        int uniqueId = counter.getAndIncrement();

//        Year currentYear = Year.now();
        int min = 100;
        int max = 999;

        // Generate a random number between min and max
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

        // Convert the current year and randNumber to string, then concatenate
//        String year = String.valueOf(currentYear);
        int randomNumber = Integer.parseInt(String.valueOf(randNumber));

        return String.format("20/%d%s/%05d", year, departmentCodeReg.toUpperCase(), randomNumber);
    }

    public static String generateIdelMatricNumber(String departmentCodeIdel) {

        int year = Calendar.getInstance().get(Calendar.YEAR) % 100;
//        int uniqueId = counter.getAndIncrement();

//        Year currentYear = Year.now();
        int min = 100;
        int max = 999;

        // Generate a random number between min and max
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

        // Convert the current year and randNumber to string, then concatenate
//        String year = String.valueOf(currentYear);
        int randomNumber = Integer.parseInt(String.valueOf(randNumber));

        return String.format("20/%d%s/%05d", year, departmentCodeIdel.toUpperCase(), randomNumber);
    }


    public static String generatePdpMatricNumber(String departmentCodePdp) {

        int year = Calendar.getInstance().get(Calendar.YEAR) % 100;
//        int uniqueId = counter.getAndIncrement();

//        Year currentYear = Year.now();
        int min = 100;
        int max = 999;

        // Generate a random number between min and max
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

        // Convert the current year and randNumber to string, then concatenate
//        String year = String.valueOf(currentYear);
        int randomNumber = Integer.parseInt(String.valueOf(randNumber));

        return String.format("20/%d%s/%05d", year, departmentCodePdp.toUpperCase(), randomNumber);
    }
}



