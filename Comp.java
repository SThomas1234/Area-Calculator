package area;

public class Comp
{
  private double pi = Math.PI;
  
  
  public void PrintArea(double area, String shape) {
	  double roundedArea = Math.round(area*100.0)/100.0;
	  
	  System.out.println("Area of " + shape + ": " + roundedArea);
  }
  
  
  public void Calculate (String shape, int a, int b){
    if (shape.equalsIgnoreCase("Triangle"))
    {
    	double area = (double)(.5*a*b);
    	PrintArea(area, shape);
    }
    		
    else if (shape.equalsIgnoreCase("Rectangle") || shape.equalsIgnoreCase("Square"))
    {
      double area = a*b;
      
      PrintArea(area, shape);
    }
    
    else if (shape.equalsIgnoreCase("Ellipse")) {
    	double area = (double)(pi*a*b);
    	PrintArea(area, shape);
    }
    
    else if (shape.equalsIgnoreCase("Rhombus") || shape.equalsIgnoreCase("Kite")) {
    	double area = (double) ((a*b) / (2));
    	PrintArea(area, shape);
    }
    
 
  }
  
  
  public void Calculate (String shape, int side) {
	  if (shape.equalsIgnoreCase("Pentagon")) {
		  double part1 = 5 * (5 + 2*Math.sqrt(5));
		  double part2 = Math.sqrt(part1);
		  double part3 = Math.pow(side, 2);
		  
		  double area = (double)(.25*part2*part3);
		  PrintArea(area, shape);
	  }
	  
	  else if (shape.equalsIgnoreCase("Hexagon")) {
		  double area = (double)(3*Math.sqrt(3))/2 * Math.pow(side, 2);
		  
		  PrintArea(area, shape);
	  }
	  
	  else if (shape.equalsIgnoreCase("Heptagon")) {
		  double angle1 = Math.cos(pi/7);
		  double angle2 = Math.sin(pi/7);
		
		  double area = (Math.pow(side,2) * (1.75) * (angle1/angle2));

		  PrintArea(area, shape);
	  }
	  
	  else if (shape.equalsIgnoreCase("Octagon")) {
		  double part1 = 1 + Math.sqrt(2);
		  double area = (double)(2*part1*Math.pow(side, 2));
		  
		  PrintArea(area, shape);
	  }
	  
	  else if (shape.equalsIgnoreCase("Nonagon")) {
		  double angle1 = Math.cos(pi/9);
		  double angle2 = Math.sin(pi/9);
		
		  double area = (Math.pow(side,2) * (2.25) * (angle1/angle2));

		  PrintArea(area, shape);
	  }
	  
	  else if (shape.equalsIgnoreCase("Decagon")) {
		  double part1 = 2* Math.sqrt(5);
		  double part2 = Math.sqrt(5 + part1);
		  double area = (double) (2.5 * Math.pow(side, 2) * part2);
		  
		  PrintArea(area, shape);
	  }
	  

  }

}
