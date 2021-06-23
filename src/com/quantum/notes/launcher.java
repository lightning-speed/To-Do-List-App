package com.quantum.notes;

import com.quantum.notes.core.Internal;
import com.quantum.notes.ui.Window;

import javax.swing.*;

public class launcher {
    public void launch(){
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Window w = new Window();
        w.setVisible(true);
        Internal.start();
    }
    public void destory(int status){
        System.exit(status);
    }
}
