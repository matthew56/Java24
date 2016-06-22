/**
 * Program requires setting a default value that is sent to the main
 * method: Select Run:Set Project Configuration:Customize then in the window 
 * select the run bullet and set the Main Class to the packagename-dot-javaProgram 
 * name - Add a numeric argument in this case 9025 - Select OK, then run project
 * from menu Run: Run Project - the result should be the square root of what-
 * ever integer was passed as an argument via the properties interface.
 */
package com.java24hours;

class NewRoot{
    public static void main(String[] arguments) {
     int number = 100;
     if(arguments.length > 0){
         number = Integer.parseInt(arguments[0]);
        }
     System.out.println("The square root of "
        + number
        + " is " 
        + Math.sqrt(number)
     
     );
    }
    
    
    
}