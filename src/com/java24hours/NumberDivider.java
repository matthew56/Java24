/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * configure with 2 arguments using Run:SetProjectConfiguration:Customise:Arguments
 * two ways one with divide by zero and one with two integers.
 * I changed this one to reflect floats for greater division precision
 *
 */
package com.java24hours;

/**
 *
 * @author matthew
 */
public class NumberDivider {
    public static void main(String[] arguments) {
        if (arguments.length == 2){
            float result = 0; // integer result = 0
            try{  
                result = Float.parseFloat(arguments[0]) / 
                        Float.parseFloat(arguments[1]);
                
                /*  result = Integer.parseInteger(arguments[0]) / 
                        Integer.parseInteger(arguments[1]); */
                System.out.println(arguments[0] + " divided by " + 
                        arguments[1] + " equals " + result);
            }
            catch(NumberFormatException e){
                
                System.out.println("Both arguments must be numbers.");
            }
            catch(ArithmeticException e){
                System.out.println("You cannot divide by zero.");
            }
            
            
        }
            
    }
    
}
