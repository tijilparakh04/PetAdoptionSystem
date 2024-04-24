package com.mycompany.petproject;

import sample.login;

public class Petproject {

    public static void main(String[] args) {
        // Create an instance of the Login class
        login LoginFrame = new login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        //login loginPage = new login();
        
        // Make the login page visible
        //loginPage.setVisible(true);
    }
}
