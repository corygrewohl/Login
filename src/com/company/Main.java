package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame;
        FrameMaker f1 = new FrameMaker();
        frame = f1.createFrame(500, 300, "Login", true, false, Color.gray);

        f1.createInputTextField(150, 100, 200, 30, "Username: ", frame);
        f1.createInputTextField(150, 130, 200, 30, "Password: ", frame);

        f1.createButton(225, 175, 50, 25, "Login", frame);

    }
}
