package com.quantum.notes.ui;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FontStyle {
    public Font getFont(String path,float size){
        //create the font
        Font customFont = null;
        try {
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\Rubik\\static\\Rubik-Regular.ttf")).deriveFont(size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (IOException e) {
            e.printStackTrace();
        } catch(FontFormatException e) {
            e.printStackTrace();
        }
        return customFont;
    }
}
