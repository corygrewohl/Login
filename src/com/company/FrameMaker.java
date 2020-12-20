package com.company;
import org.w3c.dom.Text;


import javax.swing.*;
import java.awt.*;


public class FrameMaker{

    public JFrame createFrame(int height, int width, String title, boolean vis, boolean resizable, Color c){
        JFrame frame = new JFrame(title);
        frame.setLayout(new GridBagLayout()); // FIX LAYOUT
        frame.setPreferredSize(new Dimension(height, width));
        frame.setVisible(vis);
        frame.setResizable(resizable);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(c);  //What is getContentPane()?
        frame.pack();

        return frame;
    }

    public void createInputTextField(int x, int y, int width, int height, String label, JFrame frame){
        Label l = new Label(label);
        //l.setBounds(200, 200, 100, 100);
        TextField t = new TextField(6);
        t.setBounds(x, y, width, height);

        Font font = new Font("Courier", Font.PLAIN, 15);  //Adjust as needed
        t.setFont(font);

        frame.add(l);
        frame.add(t);
    }

    public void createButton(int x, int y, int width, int height, String text, JFrame frame){
        Button b = new Button(text);
        b.setBounds(x, y, width, height);

        frame.add(b);


    }

}
