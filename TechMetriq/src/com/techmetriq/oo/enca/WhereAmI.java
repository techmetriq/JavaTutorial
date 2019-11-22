/**
 * 
 */
package com.techmetriq.oo.enca;

/**
 * @author techmetriq
 *
 */
public class WhereAmI {

    private String whereIAm = "I am with a girl in a bar";

    public String getWhereIAm(String callingNumber) {
        if (callingNumber.compareTo("GIRL FRIEND") == 0) {
            return "I am in bar.";
        }
        return whereIAm;
    }

}
