package com.quantum.notes.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button extends JButton {
    public Color after = new Color(240,240,240);
    public Button(String text){
        this.setText(text);
        this.setBorder(null);
        this.setBackground(new Color(240,240,240));
        this.setFont(new FontStyle().getFont("",(float) 30f));
        activate();
    }
    public void activate(){
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(230,230,230));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(after);
            }
        });
    }
}
