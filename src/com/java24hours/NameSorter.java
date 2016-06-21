/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.util.Arrays;

/**
 *
 * @author matthew
 */
public class NameSorter {
    public static void main(String[] arguments) {
        String names[] ={"Glimmer","Marvel", "Rue", "Clove",
            "Thrive","Foxface","Cato","Peeta", "Katniss","Matthew","Annie" };
        System.out.println("The original order:");
        for (int i = 0; i < names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
        System.out.println("==============================================");
        System.out.println();
        Arrays.sort(names);
        System.out.println("The new order:");
        for (int i = 0; i <names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
        
        System.out.println();
    } 
    
}
