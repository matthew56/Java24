package com.java24hours;

import java.io.IOException;
import java.nio.file.*;
import javax.swing.*;

public class FreeSpacePanel extends JPanel{
    JLabel spaceLabel = new JLabel("Disk space: ");
    JLabel space = new JLabel();
    
    public FreeSpacePanel(){
        super();
        add(spaceLabel);
        add(space);
        try{ setValue(); 
        }
        catch (IOException ioe) {space.setText("Error" + ioe);}
    }
    
    private final void setValue() throws IOException{
        //get the current file storage pool
        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);
        //find the free storage space
        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();
        
        double percent = (double)freeSpace / (double)totalSpace * 100;
        percent = (int)(percent * 100) / (double)100;
        //set the label's text
        space.setText(freeSpace + " free out of: " + totalSpace +
                 " (" + percent + "%)");
    }
    
    }