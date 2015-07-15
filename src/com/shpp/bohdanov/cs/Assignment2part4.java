package com.shpp.bohdanov.cs;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2part4 extends WindowProgram {
    private static final double ONE_STRIP_SIZE_X=100;
    private static final double ONE_STRIP_SIZE_Y=160;
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;
    public static final Color color1=Color.BLACK, color2=Color.YELLOW, color3=Color.RED;

    public void run() {
       // Color color1=Color.BLACK, color2=Color.YELLOW, color3=Color.RED;
        drawFlag(color1, color2, color3);
        writeCountryName("Flag of Belgium");
    }

    private void drawFlag(Color color1, Color color2, Color color3) {
        double x, y;

        //first strip
        x=getWidth()/2-1.5*ONE_STRIP_SIZE_X;
        y=getHeight()/2-0.5*ONE_STRIP_SIZE_Y;
        drawStrip(x, y, color1);

        //second strip
        x=getWidth()/2-1.5*ONE_STRIP_SIZE_X+ONE_STRIP_SIZE_X; //X-Zero of the Flag + width of one strip
        drawStrip(x, y, color2);

        //third strip
        x=getWidth()/2-1.5*ONE_STRIP_SIZE_X+ONE_STRIP_SIZE_X*2; //X-Zero of the Flag + width of two strips
        drawStrip(x, y, color3);


    }

    private void drawStrip(double x, double y, Color color) {
        GRect strip= new GRect(x,y,ONE_STRIP_SIZE_X,ONE_STRIP_SIZE_Y);
        strip.setFilled(true);
        strip.setFillColor(color);
        add(strip);
    }

    private void writeCountryName(String s) {
        double xflag;
        double yflag;
        xflag=getWidth()/2-ONE_STRIP_SIZE_X/6;
        yflag=getHeight()/2+(3*ONE_STRIP_SIZE_Y)/4;

        GLabel l = new GLabel(s, xflag, yflag);
        l.setFont("Verdana-20");
        add(l);
    }
}