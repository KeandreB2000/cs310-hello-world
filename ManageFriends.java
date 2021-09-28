/*
 * creating a program that uses two source files
 */
package managefriends;

/**
 * date 1/27/21
 * @author keeskothemagician
 */
public class ManageFriends 
{

    public static void main(String[] args) 
    {
       Friends friend1 = new Friends("Keesko The", "Magician");      //stores name for friend 1
       Friends friend2 = new Friends("Deandre","Brand");      // stores name for friend 2
       Friends friend3 = new Friends("Jeromy","Brand");     // stores name for friend 3
       
       friend1.printLastName();        // prints last name for friend 1 
       friend2.printLastName();      // prints last name for friend 2
       friend3.printLastName();      // prints name for friend 3
       
       System.out.println("Total number of friends: " + Friends.totalFriends);
       
       Friends.printInformation();    
       
        
    }
    
}
