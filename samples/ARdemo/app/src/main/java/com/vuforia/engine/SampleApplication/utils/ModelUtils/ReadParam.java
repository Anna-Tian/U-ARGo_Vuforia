package com.vuforia.engine.SampleApplication.utils.ModelUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadParam {
    public static synchronized String getParam(String param) throws IOException {
        String fileName = "model.h";
        File file = new File(fileName);
        BufferedReader reader = null;

        String line = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                line += line;
            }
            reader.close();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return line;
    }


}
