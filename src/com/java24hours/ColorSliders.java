/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;




/**
 *
 * @author matthew
 */
public class ColorSliders extends JFrame implements ChangeListener{
    /* com.esri.arcgis.beans.ui.ColorPanel is an object within the 
    * javax.swing.JPanel library, like Jslider see: 
    * http://www.tutorialspoint.com/swing/swing_jslider.htm*/
    ColorPanel canvas;
    JSlider red;
    JSlider green;
    JSlider blue;
    
    public ColorSliders(){
       super("Color Slide");
       setLookAndFeel(); //attempts to set Nimbus style and feel
       setSize(350, 300); //sets size of application interface
       setLocationRelativeTo(null); //centers the application
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       canvas = new ColorPanel();
       red = new JSlider(0,255,255); //sets 0 btm 255 as max and 255 as start
       green = new JSlider(0,255,0); // anything other than 0 for btm... will not run
       blue = new JSlider(0,255,0);
       
       red.setMajorTickSpacing(50);//sets spacing for major scale ticks
       red.setMinorTickSpacing(10);//sets spacing for minor hash mark ticks
       red.setPaintTicks(true);
       red.setPaintLabels(true);
       red.addChangeListener(this);
       
       green.setMajorTickSpacing(50);
       green.setMinorTickSpacing(10);
       green.setPaintTicks(true);
       green.setPaintLabels(true);
       green.addChangeListener(this);
       
       blue.setMajorTickSpacing(50);
       blue.setMinorTickSpacing(10);
       blue.setPaintTicks(true);
       blue.setPaintLabels(true);
       blue.addChangeListener(this);
       // creates labels for controls
       JLabel redLabel = new JLabel("Red: ");
       JLabel greenLabel = new JLabel("Green: ");
       JLabel blueLabel = new JLabel("Blue: ");
       
       //creates layout for application interface controls and displays
       GridLayout grid = new GridLayout(4,1);
       FlowLayout right = new FlowLayout(FlowLayout.RIGHT);
       setLayout(grid);
       
       JPanel redPanel = new JPanel();
       redPanel.setLayout(right);
       redPanel.add(redLabel);
       redPanel.add(red);
       add(redPanel);
       
       JPanel greenPanel = new JPanel();
       greenPanel.setLayout(right);
       greenPanel.add(greenLabel);
       greenPanel.add(green);
       add(greenPanel);
       
       JPanel bluePanel = new JPanel();
       bluePanel.setLayout(right);
       bluePanel.add(blueLabel);
       bluePanel.add(blue);
       add(bluePanel); 
       // adds color panel at bottom called "canvas" to application panel
       // sets it to visible
       add(canvas);
       setVisible(true);
        
    }
    
    public void stateChanged(ChangeEvent event){
        // whenever source stops adjusting slider, all three values are collected
        // then passed into the display box at the bottom.
        JSlider source = (JSlider) event.getSource();
        if (source.getValueIsAdjusting() !=true){
            Color current = new Color(red.getValue(),
            green.getValue(),
            blue.getValue()
            );
            //takes values collected for rgb and sends to
            canvas.changeColor(current);
            canvas.repaint();
        }  
    }
    


private void setLookAndFeel(){
    try {
        UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
        );
    } catch (Exception ex) {
        //ignor error
        
    }

}
    public static void main(String[] arguments) {
        ColorSliders cs = new ColorSliders();
        
    }    
    
}

class ColorPanel extends JPanel{
    //creates background for color display panel and sets it to red
    Color background;
    ColorPanel() {
        background = Color.red;
      
    }
    
    /*Graphics2D() is an abstract class that is used to create rectangles to 
    which further actions can be applied, methods added, components displayed, 
    modified and colored, and sized.*/
    public void paintComponent(Graphics comp){
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(background);
        comp2D.fillRect(0, 0, getSize().width, getSize().height);     
    }
    
    void changeColor(Color newBackground){
        background = newBackground;
    }
}
