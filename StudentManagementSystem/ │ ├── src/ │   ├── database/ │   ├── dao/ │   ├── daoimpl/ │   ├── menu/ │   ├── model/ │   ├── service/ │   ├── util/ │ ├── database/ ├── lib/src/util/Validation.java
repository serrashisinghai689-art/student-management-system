package util;

import java.util.regex.Pattern;

public class Validation {

    // Validate Name
    public static boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-z ]{2,30}");
    }

    // Validate Email
    public static boolean isValidEmail(String email) {

        String emailRegex =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        return Pattern.matches(emailRegex, email);
    }

    // Validate Mobile Number
    public static boolean isValidMobile(String mobile) {

        return mobile.matches("[6-9][0-9]{9}");

    }

    // Validate Age
    public static boolean isValidAge(int age) {

        return age >= 16 && age <= 40;

    }

    // Validate Percentage
    public static boolean isValidPercentage(double percentage) {

        return percentage >= 0 && percentage <= 100;

    }

}
