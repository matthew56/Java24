/*
 *I wanted to try to build a combo box..
 */
package com.java24hours;

import javax.swing.*;
import java.awt.*;
/*
 * @author matthew king
 */
 public class ComboBoxes extends JFrame{
     public ComboBoxes(){
         super("ComboBoxes");

         JComboBox profession = new JComboBox();
         FlowLayout flo = new FlowLayout();
         profession.addItem("Butcher");
         profession.addItem("Baker");
         profession.addItem("Candlestick Maker");
         profession.addItem("Fletcher");
         profession.addItem("Fighter");
         profession.addItem("Joker");
         profession.addItem("Winner");
         profession.addItem("Technical Writer");
         profession.addItem("Software Engineer");
         profession.setSelectedIndex(3);
         profession.setEditable(true);

         setLayout(flo); 
         add(profession);

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
        ComboBoxes frame = new ComboBoxes();
    }   
     
     
 }