package com.quantum.notes.core;

import com.quantum.notes.ui.AppView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Internal {
    public  static  String title = "";
    FileManager fm = new FileManager();
    public void addList(String title,String text){
        String total = title+"!@#"+text;
        total = total.replace("\n","");
        total+='\n';
        fm.write("user\\user.dat",total+fm.read("user\\user.dat"));
    }
    public String read(int point){
        String all = fm.read("user\\user.dat");
        String temp[] = all.split("\n");
        String ae[] = temp[point].split("!@#");
        this.title = ae[1];
        return ae[0];
    }
    public static void start(){

            AppView.refersh();
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            }
        });
        t.start();
    }
}
