/*
 *Create a class named Rectangle with fields named length, width, perimeter, and area. 
 *Include a constructor that sets the length and width to 1 and calculates the other two values. 
 *Also include methods named setLength(), setWidth(), getLength(), and getWidth(). 
 *The setLength(), setWidth() methods not only set the length and width, but they also calculate the other two values.
 * 
 */
package rectangle2;

/**
 *date 2/1/21
 * @author keeskothemagician
 */
public class Rectangle2 
{
    
    private double length;            // creating the private variables so it will not appear on the other file.
    private double width;
    private double perimeter;
    private double area;
        
    public Rectangle2()
    {
        length = 1;                               // the variables needed for the rectangle 
        width = 1;
        perimeter = calculatedPerimeter();
        area = calculatedArea();
           
    }
    
    public Rectangle2(double lengthval, double widthval)
    {
        length = lengthval;                     // 
        width = calculatedPerimeter();
        area = calculatedArea();
        
    }
    
    public void setwidth(double widthval)
    {
        widthval = width;
    }
    
    public double getperimeter()
    {
        return perimeter;
    }
            
    public double getlength()
    {
       return length; 
    }
    
    public double getwidth()
    {
        return width;
    }
    
    private double calculatedPerimeter()
    {
        return 2*(width + length);           // instructions used to calculate the perimeter
    }
    
    private double calculatedArea()
    {
        return length*width;           // instructions used to calculate the area 
    }
    
    public double getarea()
    {
        return area;
    }


}
