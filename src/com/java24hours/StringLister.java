package com.java24hours;

/* this application requires that  the main method is set in the configuration
along with adding  the names that are to be added to the selection of names to 
be sorted in addition to the base set...
*/
import java.util.*;

public class StringLister{
    String[] names = {"Spanky","Alfalfa","Buckwheat","Daria",
        "Stymie","Marianne","Scotty","Tommy","Chubby"};
       
    public StringLister(String[] moreNames){
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i< names.length; i++){
            list.add(names[i]);
        }
        
        for(int i = 0; i < moreNames.length; i++){
            list.add(moreNames[i]);
        }
        
        Collections.sort(list);
        
        for (String name : list){
            System.out.println(name);
        }
    }
    
    public static void main(String[] arguments) {
        StringLister lister = new StringLister(arguments);
        
    }
    
}