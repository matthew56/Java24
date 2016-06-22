package com.java24hours;

/*
*This program requires that the Run:Set Project Configuration: Customize dialog
*be used to set the startup to THIS main method AND to set the number of fake 
*virus objects are to be created and report to the screen. I added a few specific
*array numbers so that I can verify that each virus created, has its own unique
*name.
*/

public class VirusLab {
    public static void main(String[] arguments) {
        int numViruses = Integer.parseInt(arguments[0]);
            if (numViruses > 0){
                Virus[] virii = new Virus[numViruses];
                for (int i = 0; i < numViruses; i++){
                    virii[i] = new Virus();
            }
            System.out.println("There are " + Virus.getVirusCount() 
                    + " viruses.");
            System.out.println("One is named: " + virii[22]+ ".");
            System.out.println("One is named: " + virii[23]+ ".");
            System.out.println("One is named: " + virii[24]+ ".");
        }
    }
    
}
