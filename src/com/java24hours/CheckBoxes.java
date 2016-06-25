/*
 *I wanted to try the demos to see if they would work too..
 */
package com.java24hours;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author matthew
 */
public class CheckBoxes extends JFrame{
    public CheckBoxes(){
        super("CheckBoxes");
        setLookAndFeel();
        setSize(300,150);
        setLocationRelativeTo(null);
        //JLabel pageLabel = new JLabel("Check Box Demo")
        FlowLayout flo = new FlowLayout();
        ButtonGroup meals = new ButtonGroup();
        JCheckBox jumboSize = new JCheckBox("Jumbo Shrimp", true);
        JCheckBox fishTacos = new JCheckBox("Shark Tacos");
        JCheckBox chickenNuggets = new JCheckBox("Colonel Manders");
        
        meals.add(jumboSize);
        meals.add(fishTacos);
        meals.add(chickenNuggets);
        
        setLayout(flo);
        
        add(jumboSize);
        add(fishTacos);
        add(chickenNuggets);
        
        setVisible(true);
    
    }


   
private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            
        }catch(Exception exe){
          //ignore error
        }
}


    public static void main(String[] arguments) {
        CheckBoxes frame = new CheckBoxes();
    }
}
