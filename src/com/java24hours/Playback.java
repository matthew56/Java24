package com.java24hours;

import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame{
    public Playback(){
        super("Playback");
        setLookAndFeel();
        setSize(225,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        //create the instances of the required JButtons
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        // make sure to put these add functions in, but do not use 'dot' in them
        // without the add, they are not added to the window
        add(play);
        add(stop);
        add(pause);
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
        Playback frame = new Playback();
    }

}