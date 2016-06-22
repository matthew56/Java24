package com.java24hours;

class DslModem extends Modem{
    
    String method = "DSL phone connection";
    
    public void connect(){
        
        System.out.println("Connecting to the Internet ...");
        System.out.println("using " + method);
    }
}