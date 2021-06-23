package com.quantum.notes.ui;

import com.quantum.notes.core.FileManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class list extends JPanel {
    public static int h = 0;
    JLabel title;
    JLabel tex;
    public list(String text,String ti){
        title = new JLabel(ti);
        tex = new JLabel(text);
        this.setBounds(0,h,785,80);
        h+=this.getHeight();
        this.setBackground(new Color(250,250,250));
        this.setBorder(null);
        this.setLayout(null);

        title.setFont(new FontStyle().getFont("",20f));
        title.setBounds(5,5,700,30);
        title.setHorizontalTextPosition(title.LEFT);
        this.add(title);

        tex.setFont(new FontStyle().getFont("",15f));
        tex.setBounds(5,30,700,50);

        this.add(tex);
        JButton del = new JButton("");
        del.setIcon(new ImageIcon("icons\\delete.png"));
        del.setToolTipText("Delete");
        del.setBackground(this.getBackground());
        del.setBounds(710,10,50,50);
        del.setBorder(null);
        add(del);
        del.setVisible(false);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) { del.setVisible(true); }
            @Override
            public void mouseExited(MouseEvent e) { del.setVisible(false); }
        });

        del.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                delete();
            }
            @Override
            public void mousePressed(MouseEvent e) {
                delete();
            }
            @Override
            public void mouseReleased(MouseEvent e) { }
            @Override
            public void mouseEntered(MouseEvent e) {  del.setVisible(true);}
            @Override
            public void mouseExited(MouseEvent e) { }
        });

    }
    public void delete(){
        String a = title.getText()+"!@#"+tex.getText()+'\n';
        String temp  = new FileManager().read("user\\user.dat");
        temp = temp.replace(a,"");
        new FileManager().write("user\\user.dat",temp);
        AppView.refersh();
    }
}
