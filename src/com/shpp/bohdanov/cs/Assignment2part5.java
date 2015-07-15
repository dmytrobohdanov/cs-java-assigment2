package com.shpp.bohdanov.cs;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2part5 extends WindowProgram {
//    public static final double SQUARE_SIDE=30;
    public static final int APPLICATION_WIDTH = 600;
   public static final int APPLICATION_HEIGHT = 600;


    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    public void run() {
        double x,y, y1;

        x=setFirstX();
        y=setFirstY();
        y1=y;

        for(int i = 0; i<=NUM_COLS; i++){
            for(int j = 0; j<=NUM_ROWS; j++){
                drawGrid(x, y);
                y=y+BOX_SIZE+BOX_SPACING;

            }
            y=y1;
            x=x+BOX_SIZE+BOX_SPACING;
        }


    }

    private double setFirstX() {
        double x;
        x=(getWidth()-NUM_COLS*BOX_SIZE-BOX_SPACING*(NUM_COLS-1))/2;
        return x;
    }
    private double setFirstY() {
        double y;
        y=getHeight()/2-(NUM_ROWS*BOX_SIZE+BOX_SPACING*(NUM_ROWS-1))/2;

        return y;
    }

    private void drawGrid(double x, double y) {
        GRect square = new GRect(x,y,BOX_SIZE,BOX_SIZE);
        square.setFilled(true);
        square.setFillColor(Color.BLACK);
        add(square);
    }


}
