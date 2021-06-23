package com.quantum.notes.ui;

import com.quantum.notes.core.FileManager;
import com.quantum.notes.core.Internal;

import javax.swing.*;

public class Window extends JFrame {
    AppView view = new AppView();
    public Window(){
        this.setTitle("To Do List");
        this.setIconImage(new ImageIcon("icons\\icon2.png").getImage());
        this.setSize(800,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(view);
    }
}
