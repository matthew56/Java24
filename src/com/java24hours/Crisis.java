package com.java24hours;

import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame{
    /* create button component variables */
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    
    public Crisis(){
        super("Crisis");
        setLookAndFeel();
        setSize(348,128);
       // setSize(348,348);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //JPanel pane = new JPanel();
        //BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
        //pane.setLayout(box);
        
//        BorderLayout crisisLayout = new BorderLayout();
//        setLayout(crisisLayout);
        
//        GridLayout grid = new GridLayout(2,3);
//        setLayout(grid);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        /* create button instances */
        panicButton = new JButton("Panic");
        dontPanicButton = new JButton("Don't Panic");
        blameButton = new JButton("Blame Others");
        mediaButton = new JButton("Notify the Media");
        saveButton = new JButton("Save Yourself");
        
        /*add button instances to Frame */
        add(panicButton);
        add(dontPanicButton);
        add(blameButton);
        add(mediaButton);
        add(saveButton);
        
//        pane.add(panicButton);
//        pane.add(dontPanicButton);
//        pane.add(blameButton);
//        pane.add(mediaButton);
//        pane.add(saveButton);
//        add(pane);

//        add(panicButton,BorderLayout.NORTH);
//        add(dontPanicButton,BorderLayout.SOUTH);
//        add(blameButton,BorderLayout.EAST);
//        add(mediaButton,BorderLayout.WEST);
//        add(saveButton,BorderLayout.CENTER);
        
        setVisible(true);
        
    }
        
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex){
            // ignore ex
        }
    }
    // getInsets is overriddent with new spacings for the container
    public Insets getInsets(){
        Insets squeeze = new Insets(80,15,10,15);
        return squeeze;
    }
    
    public static void main(String[] args) {
        Crisis frame = new Crisis();
    }
}   