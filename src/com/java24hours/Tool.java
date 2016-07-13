/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author matthew king
 */
public class Tool extends JFrame{
    public Tool(){
        super("Tool");
        setLookAndFeel();
        setSize(370,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // sets up buttons with images
        // forward slashes are required to navigate the proper directory 
        // relative to the project folder
        
        ImageIcon image1 = new ImageIcon("images/newfile.gif");
       
        JButton button1 = new JButton("New", image1);
        
        
        ImageIcon image2 = new ImageIcon("images/openfile.gif");
        JButton button2 = new JButton("Open ", image2);
        
        ImageIcon image3 = new ImageIcon("images/savefile.gif");
        JButton button3 = new JButton("Save", image3);
        
        
        // build toolbar
        JToolBar bar = new JToolBar();
        bar.add(button1);
        bar.add(button2);
        bar.add(button3);
        
        //build text area
        
        JTextArea edit = new JTextArea(8,40);
        JScrollPane scroll = new JScrollPane(edit);
        
        //create  frame
        
        BorderLayout border = new BorderLayout();
        setLayout(border);
        add("North", bar);
        add("Center", scroll);
        setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
        

    


    private void setLookAndFeel(){

                try{ 
                    UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
                    );
                    }  catch (Exception ex){
                    //ignore error
                    }

        }


    
    public static void main(String[] arguments){
     Tool frame = new Tool();
    }
    
    
    
    
}
