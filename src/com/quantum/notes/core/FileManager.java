package com.quantum.notes.core;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    public String read(String path){
        String out = "";
        try {
            Scanner s = new Scanner(new File(path));
            while (s.hasNextLine()) {
                out += s.nextLine()+'\n';
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return out;
    }
    public void write(String path,String Text){
        if(!new File(path).exists()) {
            try {
                new File(path).createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            OutputStream o = new FileOutputStream(new File(path));
            for(int i = 0;i<Text.length();i++)
            o.write(Text.charAt(i));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
