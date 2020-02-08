package com.virtual.assign;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public  String inputread() throws IOException {
        File file = new File("//Users//rishabh_hurr//Downloads//TddAssign//src//com//virtual//assign//input");
        BufferedReader br = new BufferedReader(new FileReader(file));
        //String st=br.readLine();
//        while ((st = br.readLine()) != null) {
//            //System.out.println(st);
//        }
        return (br.readLine());
    }
}
