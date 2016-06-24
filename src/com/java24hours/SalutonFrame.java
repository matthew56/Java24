package com.java24hours;

import javax.swing.*;

public class SalutonFrame extends JFrame{
    public SalutonFrame(){
        super("Saluton mondo!");
        setLookAndFeel(); /*this item threw error at first because 
        the method was not yet created*/
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        }
        catch(Exception exe){
          //ignore error
        }
    }
        
    public static void main(String[] arguments) {
        SalutonFrame frame = new SalutonFrame();
        frame.setLocation(1000, 500);
    }
    
}
