package com.java24hours;

class Credits{
    
    public static void main(String[] arguments){
        //set up film information
        String title = "Sharknado";
        int year = 2013;
        String director = "Anthony Ferrante";
        String role1 = "Fin";
        String actor1 = "Ian Ziering";
        String role2 = "April";
        String actor2 = "Tara Reid";
        String role3 = "George";
        String actor3 = "John Heard";
        actor3 = actor3.toLowerCase(); //makes all chars lower case
        String role4 = "Nova";
        String actor4 = "Cassie Scerbo";
        actor4 = actor4.toUpperCase(); // makes all chars upper case
        //display information
        
        System.out.println(title + " (" + year + ")\n" +
                "An " + director + " film.\n\n" +
                role1 + "\t" + actor1 + "\n"+
                role2 + "\t" + actor2 + "\n"+
                role3 + "\t" + actor3 + "\n"+
                role4 + "\t" + actor4);
        
        String favorite = "chainsaw";
        String guess = "poolcue";
        System.out.println ("Is Fin's favorite weapon a " + guess + "?");
        System.out.println("Anser: " + favorite.equals(guess));
    }
}