/*


*/
package lab3;

/**
 * date 1/25/21
 * @author keeskothemagician
 */
public class Lab3 // imported the scanner class to do multiple things 
{

    public static void main(String[] args) 
    {
        System.out.println("Square of 4 is " + square(8) + "\n");         // inserted two different data types
        System.out.println("Square of 4.4 is " + square(8.8) + "\n");
    }
    
    public static int square(int intValue)
    {
        System.out.println("\nCalled square with int argument: " + intValue +"\n");          // implemented the rule that has to be used to get the answer 
        return intValue*intValue;
        
        
    }
    
    public static double square(double doubleValue)       
    {
        System.out.println("\nCalled square with double argument: " + doubleValue + "\n");   // the same principle used for the intValue 
        return doubleValue*doubleValue;
    }
    
    
        
    
}
