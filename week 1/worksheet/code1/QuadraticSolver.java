/*
 * QuadraticSolver.java  	1.1 26/08/2011
 *
 * Copyright (c) University of Sheffield 2011
 */

import java.io.IOException;
import sheffield.*;

/**
 * QuadraticSolver.java solves quadratic equations for x given a*x*x + b*x + c =
 * 0 the code should be modified so that a, b, and c are input by the user
 *
 * @version 1.1 26 August 2011
 *
 * @author Mark Stevenson (mark.stevenson@sheffield.ac.uk)
 * @author (based on code written by Richard Clayton)
 */
public class QuadraticSolver {
    public static void main(String[] arg) {

        // default values for coefficients a, b, and c
        // initially, these are stored as both integers and float
        int aInt, bInt, cInt;
        aInt = 1; bInt = 2000000; cInt = 1;

        // allow user to input the value
        EasyReader easyReader = new EasyReader();
        // aInt = easyReader.readInt("Input a value for a (Int): ");
        // bInt = easyReader.readInt("Input a value for b (Int): ");
        // cInt = easyReader.readInt("Input a value for c (Int): ");

        try {
            easyReader.close();
        } catch (IOException e) {

        }

        // Double
        
        // double aFloat = 1, bFloat = 2, cFloat = 1;
        double aFloat = 1, bFloat = 2000000, cFloat = 1;

        // declare variables to store the two values of x that satisfy the equation
        double x1, x2;

        // work out the solution with int types
        // aInt -= 1 / 2;
        x1 = (-1 * bInt + Math.sqrt(bInt * bInt - 4 * aInt * cInt)) / (2 * aInt);
        x2 = (-1 * bInt - Math.sqrt(bInt * bInt - 4 * aInt * cInt)) / (2 * aInt);

        System.out.println("Solution with integer types is x1 = " + x1 + ", and x2 = " + x2);
        // Solution with integer types is x1 = -981389.2005813828, and x2 = -1018610.7994186172

        // work out the solution with double types
        // aFloat -= 0.5;
        x1 = (-1 * bFloat + Math.sqrt(bFloat * bFloat - 4 * aFloat * cFloat)) / (2 * aFloat);
        x2 = (-1 * bFloat - Math.sqrt(bFloat * bFloat - 4 * aFloat * cFloat)) / (2 * aFloat);

        System.out.println("Solution with double types is  x1 = " + x1 + ", and x2 = " + x2);
        // Solution with double types is  x1 = -5.00003807246685E-7, and x2 = -1999999.9999994999

        // test the result
        double t_x1 = -5.00003807246685E-7;
        double t_x2 = -1999999.9999994999;

        double result1 = aFloat * Math.pow(t_x1, 2) + bFloat * t_x1 + cFloat;
        double result2 = aFloat * Math.pow(t_x2, 2) + bFloat * t_x2 + cFloat;
        // double result2 = aFloat * t_x2 * t_x2 + bFloat * t_x2 + cFloat;

        System.out.println("Result1 = " + result1 + ".");
        System.out.println("Result2 = " + result2 + ".");
        // Result1 = -7.614493120033927E-6.
        // Result2 = -4.8828125E-4.
        // Correct!

    }
}
