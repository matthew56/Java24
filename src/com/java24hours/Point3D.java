package com.java24hours;

import java.awt.*;

public class Point3D extends Point{
    public int z;
    
    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    
    public void move(int x, int y, int z){
        this.z = z;
        super.move(x, y);
        
    }
    /* the value of z is set at 71 in the main method
       the value of z passed to this method is -20
       changing the z value to 71-20, or 51 which updates the
       value of z set in the main method, which is then printed
       from the main method.
    */
    
    public void translate(int x, int y, int z){
        this.z += z;
        System.out.println("Value of z has been modified by the value passed +"
                + "to the method, resulting in: " + this.z);
        super.translate(x, y);
    }
}