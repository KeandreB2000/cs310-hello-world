/*
 * 
 */
package circle;

/**
 * date 1/29/21
 * @author keeskothemagician
 */
public class circle  
{
        private double radius;            // putting it in private so the double radius,diameter,area won't appear in the other file
        private double diameter;
        private double area;


public circle()
{
    {
    radius = 1;
    computediameter();           // the rules for computing the diameter and area
    computearea();
    }
}
public void setradius(double radiusvalue)
{
 
    radius = radiusvalue;            
    computediameter();
    computearea();
    
}
public double getradius(){
    return radius;
}
public double getdiameter()
{
    return diameter;
}
        
public double getarea()
{
    return area; 
}

private void computediameter()
{
    diameter = 2*radius;           // the formula for the diameter
}

private void computearea()
{
    area = Math.PI*radius*radius;      // the formula for the area 
}

}
   
