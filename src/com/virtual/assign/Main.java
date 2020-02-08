package com.virtual.assign;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        NoOfSetBit ns=new NoOfSetBit();
        //System.out.println(rf.inputread());
        //input=Integer.parseInt(rf.inputread());
        int ans = ns.countSetBits();
       System.out.println(" "+ans);
    }
}
