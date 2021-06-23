package com.quantum.notes.ui;

import com.quantum.notes.core.Internal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateWindow extends JFrame {
    JPanel pane = new JPanel();
    JTextField til= new JTextField();
    JLabel tl = new JLabel("Title: ");
    Font f = new FontStyle().getFont("",(float) 17f);
    JLabel tel = new JLabel("Text: ");
    JTextField to  = new JTextField();
    JButton ok  = new JButton("Done");
    JButton can  =  new JButton("Cancel");
    public CreateWindow(){
        super("Create");
        this.setSize(600,200);
        this.setResizable(false);
        this.setIconImage(new ImageIcon("icons\\icon2.png").getImage());
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(pane);
        pane.setLayout(null);
        pane.add(til);
        til.setBounds(70,3,505,27);
        til.setName("Ab ");
        til.setFont(f);
        tl.setFont(f);
        tl.setBounds(5,3,70,27);
        pane.add(tl);
        tel.setFont(f);
        tel.setBounds(5,45,70,27);
        pane.add(tel);
        to.setFont(f);
        to.setBounds(5,75,575,27);
        pane.add(to);
        ok.setFont(f);
        ok.setBounds(5,120,100,30);
        ok.setBackground(new Color(100,150,255));
        ok.setBorderPainted(true);
        ok.setForeground(Color.WHITE);
        pane.add(ok);
        can.setFont(f);
        can.setBounds(105,120,100,30);
        can.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(til.getText().length()>1&&to.getText().length()>1) {
                    new Internal().addList(til.getText(), to.getText());
                    setVisible(false);
                    AppView.refersh();
                }
            }
        });
        pane.add(can);
    }
}
