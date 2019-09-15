package area;

import java.util.Scanner;
import java.util.*;
public class Area
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    // look for shapes with three inputs
    // change all inputs to doubles
    
    String [] standardShapes = {"triangle", "square", "rectangle", "ellipse", "rhombus", "kite"};
    String [] polygons = {"pentagon", "hexagon", "heptagon", "octagon", "nonagon", "decagon"};
    
    System.out.println("Welcome! What shape's area do you need to calculate today?");
    
    String shape = scan.nextLine();
    
    if (Arrays.asList(standardShapes).contains(shape.toLowerCase())) {
    	System.out.println("Enter the " + shape + "'s dimensions.");
    	int a = scan.nextInt();
        int b = scan.nextInt();
        
        while (a<=0 || b<=0) {
        	System.out.println("Values cannot be less than or equal to zero. Please try again");
        	a = scan.nextInt();
        	b = scan.nextInt();
        }
        Comp compObject = new Comp();
        compObject.Calculate(shape, a, b);
    }
    

    else if (Arrays.asList(polygons).contains(shape.toLowerCase())){
    	System.out.println("Enter the length of the " + shape + "'s side.");
    	int side = scan.nextInt();
    	
    	while (side<=0) {
    		System.out.println("Side cannot be less than or equal to zero. Please try again.");
    		side = scan.nextInt();
    	}
    	
    	Comp compObject = new Comp();
        compObject.Calculate(shape, side);
    }
    
    else
    	System.out.println("We currently cannot calculate the area of a " + shape + ".");
   
    scan.close();
    
    
  }
}
