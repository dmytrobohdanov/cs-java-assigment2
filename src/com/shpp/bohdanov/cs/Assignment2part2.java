package com.shpp.bohdanov.cs;

import com.shpp.cs.a.graphics.WindowProgram;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GLabel;

import java.awt.*;


public class Assignment2part2 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT = 800;


    public static final int windowSize =50;


    public void run() {
        double height= getHeight();
        double width=getWidth();
        double ballRadius= width/6;
        double rectHeight= height-ballRadius*2;
        double rectWidth= width-ballRadius*2;
        int x,y;


        x=(int)(width-ballRadius*2);
        y=0;
        GOval ballUpRight = new GOval(x,y,ballRadius*2,ballRadius*2);
        ballUpRight.setFilled(true);
        ballUpRight.setFillColor(Color.BLACK);
        add(ballUpRight);

        x=0;
        y=0;
        GOval ballUpLeft = new GOval(x,y,ballRadius*2,ballRadius*2);
        ballUpLeft.setFilled(true);
        ballUpLeft.setFillColor(Color.BLACK);
        add(ballUpLeft);

        x=(int)(width-ballRadius*2);
        y=(int)(height-ballRadius*2);
        GOval ballDownRight = new GOval(x,y,ballRadius*2,ballRadius*2);
        ballDownRight.setFilled(true);
        ballDownRight.setFillColor(Color.BLACK);
        add(ballDownRight);

        x=0;
        y=(int)(height-ballRadius*2);
        GOval ballDownLeft = new GOval(x,y,ballRadius*2,ballRadius*2);
        ballDownLeft.setFilled(true);
        ballDownLeft.setFillColor(Color.BLACK);
        add(ballDownLeft);


        x=(int)(ballRadius);
        y=(int)(ballRadius);
        GRect square = new GRect(x,y,rectWidth,rectHeight);
        square.setFilled(true);
        square.setFillColor(Color.WHITE);
        add(square);

    }


}