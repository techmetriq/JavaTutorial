package com.techmetriq.oo.abst;

/**
 * @author techmetriq
 *
 */

public class Abstraction {

    public static void main(String args[]) {
        WatchMovie yourWeekendPlan = new YourPlan();
        WatchMovie girlFriendweekendPlan = new GirlFriendPlan();
        System.out.println("YourPlan : " + yourWeekendPlan.watch());
        System.out.println("GirlFriendPlan : " + girlFriendweekendPlan.watch());

    }

    /* OUTPUT : 
     *          YourPlan : LOVE MOVIE
     *          GirlFriendPlan : ACTION MOVIE
     */
}
