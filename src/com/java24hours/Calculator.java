/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * configure by configuring to run as the main method in Run:Set Project 
 * Configuration : Configuration : Arguments to Pass : 7 4 8 1 4 1 4 19 -12
 * using a non-integer throws and exeption and an error message
 */
package com.java24hours;

/**
 *
 * @author matthew
 */
public class Calculator {
    public static void main(String[] arguments) {
        float sum = 0;
        for (String argument : arguments )
        {
        try {
            sum = sum + Float.parseFloat(argument);
            }
        catch (NumberFormatException e)
            {
            System.out.println(argument + " is not a number.");
            }
         }
        
        System.out.println("Those numbers add up to " + sum);
            
    }
    
}
