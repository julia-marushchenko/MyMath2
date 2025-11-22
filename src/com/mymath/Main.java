/**
 * Java program to demonstrate acos() and abs().
 */

package com.mymath;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating variables
        int int_value = -3;
        double double_value = - .9;
        long long_value = -12L;

        // Printing the values of variables to console
        System.out.println("Integer number: " + int_value);
        System.out.println("Double  number: " + double_value);
        System.out.println("Long  number: " + long_value + "L");

        // Using abs() method to convert numbers to positive ones and printing to console
        System.out.println("Integer number: " + Math.abs(int_value));
        System.out.println("Double  number: " + Math.abs(double_value));
        System.out.println("Long  number: " + Math.abs(long_value) + "L");

        // Finding cosinus of 30° and printing to console
        System.out.println("Cosinus of 30°: " + Math.cos(30)); // Output: 0.15425144988758405

        // Finding arccosinus of 30° and printing to console
        System.out.println("Arccosinus of 30°: " + Math.acos(30)); // Output: NaN

        // Finding arccosinus of 60° and printing to console
        System.out.println("Arccosinus of 60°: " + Math.acos(60)); // Output: NaN

    }
}