package com.company;
import org.w3c.dom.Text;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


public class Login extends JFrame {

    JPanel panel;
    JLabel userLabel;
    JLabel passwordLabel;
    JTextField userField;
    JPasswordField passwordField;
    JButton login;
    JCheckBox seePassword;


    public Login(){
        panel = new JPanel();
        userLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        userField = new JTextField();
        passwordField = new JPasswordField();
        login = new JButton("Login");
        seePassword = new JCheckBox("Show Password");

        setPreferredSize(new Dimension(500, 300));
        setTitle("Login");
        setLocation(500, 200);
        setResizable(false);
        //method for changing background color?
        panel.setLayout(null);

        userField.setBounds(150, 100, 200, 30);
        passwordField.setBounds(150, 130, 200, 30);
        login.setBounds(225, 175, 70, 30);
        userLabel.setBounds(85, 100, 200, 30);
        passwordLabel.setBounds(85, 130, 200, 30);
        seePassword.setBounds(85, 160, 115, 50);

        //passwordField.setEchoChar((char)0);

        panel.add(userField);
        panel.add(passwordField);
        panel.add(login);
        panel.add(userLabel);
        panel.add(passwordLabel);
        panel.add(seePassword);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        seePassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(seePassword.isSelected()){
                    passwordField.setEchoChar((char)0);
                } else {
                    passwordField.setEchoChar('*');
                }
            }
        });
    }

}
