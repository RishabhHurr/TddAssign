package com.virtual.assign;

import java.io.IOException;

public class NoOfSetBit {
    private ReadFile rf;
    public void setfile(ReadFile rf){
        this.rf = rf;
    }
    public int countSetBits() throws IOException {
        int n=Integer.parseInt(rf.inputread()),m;
        m=n;
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        System.out.println("No of set bits in "+m+" is ");
        return count;
    }
}
