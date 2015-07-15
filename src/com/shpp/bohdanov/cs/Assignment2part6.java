package com.shpp.bohdanov.cs;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.util.RandomGenerator;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2part6 extends WindowProgram {


    private static final int NUMBER_OF_ELEMENTS = 15;
    private static final double LOWER_ELEMENT_POSITION =20; //dOY-difference between y-coordinate of upper and lower  element
    private static final double CROSSING_OF_ELEMENTS=20;
    private static final double SIZE_OF_ELEMENT=50;



    public void run() {
        double x=0; //we define only X, cause Y-coordinate have only 2 values in this program,
                    //y is defined in drawElement() as a local varuable 

        for(int i=1; i<=NUMBER_OF_ELEMENTS; i++){

            if(!isItEnoughSpaceForOneMoreElement(x))
                break;

            boolean upDownPosition=setUpOrDown(i); //true means UP, false means DOWN
            drawElement(x, upDownPosition); //every 2nd element is on the "graund" others is upper for rand number
            x=x+SIZE_OF_ELEMENT-CROSSING_OF_ELEMENTS;
        }

    }

    private void drawElement(double x, boolean upDownPosition) {
        double y;
        if(upDownPosition){
            RandomGenerator r=RandomGenerator.getInstance();
            y=r.nextDouble(0, LOWER_ELEMENT_POSITION);
        }
        else 
            y= LOWER_ELEMENT_POSITION;




        GOval element= new GOval(x,y,SIZE_OF_ELEMENT, SIZE_OF_ELEMENT);


        //set to object a random color
        RandomGenerator r=RandomGenerator.getInstance();
        Color elementColor=r.nextColor();
        element.setColor(elementColor);

        //getting another color for fill and set this color as fill
        Color elementFillColor=getAnotherColor(elementColor);
        element.setFilled(true);
        element.setFillColor(elementFillColor);

        add(element);

    }

    private Color getAnotherColor(Color elementColor) {
        RandomGenerator r=RandomGenerator.getInstance();
        Color t=r.nextColor();
        while (t==elementColor)
            t = r.nextColor();
        return t;
    }

    private boolean setUpOrDown(int i) {
        return i % 2 == 0;
    }

    private boolean isItEnoughSpaceForOneMoreElement(double x) {
        double s=getWidth()-x;
        if (s>=(SIZE_OF_ELEMENT-CROSSING_OF_ELEMENTS))
           return true;
        return false;
    }
}
