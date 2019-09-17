import java.util.Scanner;
import java.util.*;
public class Area
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    // change all inputs to doubles
    // create functionality to allow users to calculate the area of more than one shape (while loop?)
    
    String [] standardShapes = {"triangle", "square", "rectangle", "ellipse", "rhombus", "kite"};
    String [] polygons = {"pentagon", "hexagon", "heptagon", "octagon", "nonagon", "decagon"};
    
    System.out.println("Welcome! What shape's area do you need to calculate today?");
    
    String shape = scan.nextLine();
    
    if (shape.equalsIgnoreCase("circle")) {
		System.out.println("Enter the circle's radius.");
		double radius = scan.nextDouble();
		
		while (radius<=0) {
			System.out.println("Radius cannot be less than or equal to zero. Please try again.");
			radius = scan.nextDouble();
		}
		
		Comp compObject = new Comp();
        compObject.CalculateCircle(shape, radius);
	}
	
	else if (shape.equalsIgnoreCase("trapezoid")) {
		System.out.println("Enter the values for the bases and height of the trapezoid");
		double base1 = scan.nextDouble();
		double base2 = scan.nextDouble();
		double height = scan.nextDouble();
		
		while (base1<=0 || base2<=0 || height<=0) {
			System.out.println("Values cannot be less than or equal to zero. Please try again.");
			base1 = scan.nextDouble();
    		base2 = scan.nextDouble();
    		height = scan.nextDouble();
		}
		
		Comp compObject = new Comp();
		compObject.CalculateTrapezoid(shape, base1, base2, height);
	}
    
    else if (Arrays.asList(standardShapes).contains(shape.toLowerCase())) {
    	System.out.println("Enter the " + shape + "'s dimensions.");
    	double a = scan.nextDouble();
        double b = scan.nextDouble();
        
        while (a<=0 || b<=0) {
        	System.out.println("Values cannot be less than or equal to zero. Please try again");
        	a = scan.nextDouble();
        	b = scan.nextDouble();
        }
        Comp compObject = new Comp();
        compObject.Calculate(shape, a, b);
    }
    
    
    else if (Arrays.asList(polygons).contains(shape.toLowerCase())){
    	System.out.println("Enter the length of the " + shape + "'s side.");
    	double side = scan.nextDouble();
    	
    	while (side<=0) {
    		System.out.println("Side cannot be less than or equal to zero. Please try again.");
    		side = scan.nextDouble();
    	}
    	
    	Comp compObject = new Comp();
        compObject.CalculatePolygons(shape, side);
    }
    
 
    else
    	System.out.println("We currently cannot calculate the area of a " + shape + ".");
   
    scan.close();
    
    
  }
}