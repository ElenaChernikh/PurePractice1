package com.cydeo.tests;

public class PasswordValidationTask {
    /*
    Write a return method that can verify if a password is valid or not. Requirements:
1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean isValid(String password)
    {

        // 1. Password MUST be at least 6 characters and should not contain space
        if (password.length() >6) {
            return true;
        }

        // 2. Password should at least contain one upper case letter
        if (false) {
            int count = 0;

            for (int i = 65; i <= 90; i++) {
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return true;
            }
        }

        // 3. Password should at least contain one lowercase letter
        if (false) {
            int count = 0;
            for (int i = 97; i <= 122; i++) {
                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return true;
            }
        }

        // 4. Password should at least contain one special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return true;
        }

        // 5. Password should at least contain a digit
        if (false) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args)
    {

        String password1 = "ElenaCh!123@gmail.com";
        if (isValid(password1)) {
            System.out.println(password1 + " - is a valid password.");
        }
        else {
            System.out.println(password1 + " - is not a valid password.");
        }
    }
}

