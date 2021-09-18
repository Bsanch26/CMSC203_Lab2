import java.util.Scanner;

public class SphereVolume 
{
	public static void main(String[] args) 
	{ 
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("Please enter the diameter of the sphere.");
		double diam = userInput.nextDouble();
		double r;
		r = diam/2;
		double v;
		
		//Calculating Volume of Sphere
		
		v = (4)*Math.PI*Math.pow(r,3)/3;
		
		System.out.println("The volume of the sphere is " + v);
		
		
	}
}
