package com.java24hours;
/* read header comment from the header of the Point3D class with the
comments in the code
*/
import java.awt.*;
class PointTester{
    public static void main(String[] arguments) {
        Point location1 = new Point(11,22);
        Point3D location2 = new Point3D(7,6,64);
        
        System.out.println("The 2D point is at (" + location1.x + ", " +
                + location1.y + ")" );
        System.out.println("It's being moved to (10,22)");
        
        location1.move(10,22);
        
        System.out.println("The 2D point is now at ("+ location1.x + ", " +
                + location1.y + ")" );
        System.out.println("It's being moved -10 units on both the x "
        +"and y axes.");
        
        location1.translate(-10,-10);
        System.out.println("The 2D point ends up at (" + location2.x + ", " +
                location1.y + ")");
        
        
        System.out.println("The 3D point is at (" + location2.x + ", " +
                + location2.y + ", " + location2.z + ")" );
        System.out.println("It's being moved to (10,22,71)");
        
        location2.move(10,22,71);
        
        System.out.println("The 3D point is now at ("+ location2.x + ", " +
                + location2.y + ", " + location2.z +")" );
        System.out.println("It's being moved 20 units on each of the x "
        +"y and z axes.");
        
        location2.translate(-20,-20,-20);
        System.out.println("The 3D point ends up at (" + location2.x + ", " +
                location2.y +", "+ location2.z +")");
        

           
        
        
    }
    
    
}