package com.quantum.notes.ui;

import com.quantum.notes.core.FileManager;
import com.quantum.notes.core.Internal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppView extends JPanel {
    JLabel li = new JLabel("To Do List");
    static JTextArea pa = new JTextArea();
    JScrollPane pane = new JScrollPane(pa);
    JButton add = new JButton("Add New");
    public AppView(){
        add.setIcon(new ImageIcon("icons\\add.png"));
        this.setLayout(null);
        this.add(li);
        this.add(add);
        add.setBounds(7,65,155,35);

        add.setBackground(new Color(240,240,240));
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreateWindow();
            }
        });
        add.setFont(new FontStyle().getFont("",(float) 17f));
        li.setBounds(7,5,200,35);
        li.setFont(new FontStyle().getFont("",(float) 30f));
        this.setBackground(Color.WHITE);
        pa.setBackground(Color.WHITE);
        pa.setEnabled(false);
        pane.setBackground(Color.WHITE);
        pane.setBounds(0,110,785,350);
        pa.setRows(100);
        this.add(pane);
        refers();
    }
    public void refers(){
        pa.removeAll();
        Internal ai = new Internal();
        int temp = 0;
        String t = new FileManager().read("user\\user.dat");
        for(int i = 0;i<t.length();i++)if(t.charAt(i)=='\n')temp++;
        for(int i = 0;i<temp;i++) {
            String text = ai.read(i);
            String title = ai.title;
            pa.add(new list(title, text));
        }

    }
    public static void refersh(){
        pa.removeAll();
        list.h=0;
        Internal ai = new Internal();
        int temp = 0;
        String t = new FileManager().read("user\\user.dat");
        for(int i = 0;i<t.length();i++)if(t.charAt(i)=='\n')temp++;
        for(int i = 0;i<temp;i++) {
            String text = ai.read(i);
            String title = ai.title;
            pa.add(new list(title, text));
        }
        pa.repaint();
        pa.setRows(list.h/15);
    }

}
