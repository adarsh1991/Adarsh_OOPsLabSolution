package com.greatlearning.service;

import java.util.Random;

public class CredentialsGenerator {

    /**
     * Returns emailId based on firstName, lastName and department.
     * @param - firstName of the employee.
     * @param - lastName of the employee.
     * @param - department of the employee.
     * @return - EmailId of employee based on department.
     **/
    public String generateEmail(String firstName, String lastName, String department) {
        return firstName+lastName+"@"+department+".xyz.com";
    }

    /**
     * Returns randomly generated password.
     * @return - generted password.
     **/
    public char[] generatePassword() {
        String upperAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlpha = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*+-_<>?.";
        String allowedChars = upperAlpha+lowerAlpha+numbers+specialCharacters;

        Random random = new Random();
        char[] password = new char[8];
        for (int i=0; i<8; i++) {
            password[i] = allowedChars.charAt(random.nextInt(allowedChars.length()));
        }
        return  password;
    }

    /**
     * Prints the generated credentials.
     * @param - employee first name.
     * @param - generated email.
     * @param - generated password.
     **/
    public void printGeneratedCredentials(String employeeFirstName, String email, char[] password) {
        System.out.println("Dear "+employeeFirstName+" your generated credentials are as follows.");
        System.out.println("Email ----> " + email);
        System.out.println("Password ----> "+ new String(password));
    }
}
