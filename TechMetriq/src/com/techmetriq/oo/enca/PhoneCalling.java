package com.techmetriq.oo.enca;

/**
 * @author techmetriq
 *
 */
public class PhoneCalling {

    public static void main(String args[]) {
        WhereAmI me = new WhereAmI();
        System.out.println("GirlFriend calling : " + me.getWhereIAm("GIRL FRIEND"));

        System.out.println("A friend calling : " + me.getWhereIAm("FRIEND"));

        // girl friend wants where you are  exactly
        // error not no authority because WhereAmI class private
        //System.out.println("GirlFriend calling : " + me.whereIAm); 

    }
}

/*
 OUTPUT : 
         GirlFriend calling : I am in bar.
         A friend calling : I am with a girl in a bar
*/