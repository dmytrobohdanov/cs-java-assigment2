package com.shpp.bohdanov.cs;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {

    public void run() {
        double a, b, c, diskr, x1,x2;
        int n;

        a = readDouble();
        b = readDouble();
        c = readDouble();

        diskr=diskriminant(a, b, c);
        n = howManyRoots(diskr);

        if (n == 2){
            x1=(-b+Math.sqrt(diskr))/(2*a);
            x2=(-b-Math.sqrt(diskr))/(2*a);
            println("There are 2 roots: "+x1+" and "+x2);
        }
        if (n == 1){
            x1=(-b+Math.sqrt(diskr))/(2*a);
            println("There is one root: "+x1);
        }
        if (n == 0){
            println("There is no real roots");
        }

    }

    private int howManyRoots (double diskr) {
        if(diskr>0)
            return 2;
        if(diskr==0)
           return 1;
        if(diskr<0)
            return 0;
        return 0;
    }




    private double diskriminant (double a, double b, double c) {
        double disikr;
        disikr=b*b-4*a*c;
        return disikr;
    }

}