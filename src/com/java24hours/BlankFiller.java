package com.java24hours;
/*1. Choose the menu command Run , Set Project Configuration, Customize. The Project Properties dialog opens.
2. Enter "com.java24hours.BlankFiller in the Main Class text field."
3. in the Arguments field enter three adjectives for "arguments" to be inserted 
in the Main class
4. to run this customized project that uses arguments, instead of right clicking 
on the java file and selecting run, you must run the file by selecting "Run Project"
from the Run menu command.
Then the program will run the java file  using the arguments you supplied within
the configuration of arguments within the customized Project Configuration diaglog.
*/

class BlankFiller{
public static void main(String[] arguments){
    System.out.println("The " + arguments[0]
        + " " + arguments[1] + " foxes "
        + "jumped over the "
        + arguments[2] + " dog. "
    );
 
    }

}
