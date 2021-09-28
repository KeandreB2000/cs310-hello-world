/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author keeskothemagician
 */

package testwedding;

import java.time.LocalDate;
import java.time.Month;

public class TestWedding 
{

    public static void main(String[] args) 
    {
        Person personhusband = new Person("Keesko The" , "Magician", LocalDate.of(2000, Month.OCTOBER, 16));
        Person personwife = new Person("Megan The", "Stallion", LocalDate.of(2000, Month.MARCH, 1));
        Couple couplenames = new Couple(personwife, personhusband);
        Wedding weddingObject = new Wedding(LocalDate.of(2030, Month.JULY, 3), "Paris", couplenames);
        
        Person personhusband2 = new Person("Keesko The" , "Magician", LocalDate.of(2000, Month.OCTOBER, 16));
        Person personwife2 = new Person("Megan The", "Stallion", LocalDate.of(2000, Month.MARCH, 1));
        Couple couplenames2 = new Couple(personwife2, personhusband2);
        Wedding weddingObject2 = new Wedding(LocalDate.of(2030, Month.JULY, 3), "Paris", couplenames2);
        
        displayWeddingDetails(weddingObject);
        displayWeddingDetails(weddingObject2);        
        
        
         
    }
     
    public static void displayWeddingDetails(Wedding w)
    {
        System.out.println("\nWeddingdetails:");
        System.out.println("*****************");
        System.out.println("Wife's name: " + w.getnames().getwife().getfirstName() + " " + w.getnames().wife.getlastName() + "DOB: " + w.getnames().wife.getbirthDate());
        System.out.println("Husband's name: " + w.getnames().gethusband().getfirstName() + " " + w.getnames().husband.getlastName() + "DOB: " + w.getnames().husband.getbirthDate());
        System.out.println("Wedding date: " + w.getweddingDate());
        System.out.println("Wedding location: " + w.getweddingLocation());


        
    }



}
