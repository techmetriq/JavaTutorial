/**
 * 
 */
package com.techmetriq.oo.inhe;

/**
 * @author techmetriq
 *
 */
public class Inheritence {

    public static void main(String args[]) {
        SecondLanguage russianPerson = new SecondLanguage();
        System.out.println("Native Language : " + russianPerson.getNativelanguage());
        System.out.println("Second Language : " + russianPerson.getSecondlanguage());

    }
}

/* OUTPUT :
             Native Language : RUSSIAN
             Second Language : ENGILISH
*/
