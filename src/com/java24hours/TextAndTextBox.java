/*
 *I wanted to try the demos to see if they would work too..
 */
package com.java24hours;

import javax.swing.*;
import java.awt.*;

public class TextAndTextBox extends JFrame{
    public TextAndTextBox(){
    super("TextAndTextBox");
    setLookAndFeel();
    setSize(450,80);
    setLocationRelativeTo(null);  //sets location at center of screen
    //setLocation(25,25); //sets location at 25px from top and left of screen
    JLabel pageLabel = new JLabel("Web page address", JLabel.RIGHT);
    JTextField pageAddress = new JTextField("http://win-hia5qddsfma/", 25); 
    FlowLayout flo = new FlowLayout();
    setLayout(flo);
    add(pageLabel);
    add(pageAddress);
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
        TextAndTextBox frame = new TextAndTextBox();
    }
}


