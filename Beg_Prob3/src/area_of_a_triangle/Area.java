package area_of_a_triangle;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		//Ask the user to enter the length and width. Calculate and print the area.
		//Formula: Area = length * width
		
		//Create Scanner for input
		Scanner i = new Scanner(System.in);
		
		//Prompt for rectangle length 
		System.out.print("Enter the length of the rectangle: ");
		int l = i.nextInt();
		
		//Prompt for rectangle width 
		System.out.print("Enter the width of the rectangle: ");
		int w = i.nextInt();
		
		//Calculate the area of the rectangle 
		int f = l * w;
		
		//Display results
		System.out.println("The area of the rectangle is: " + f);
		
		//scanner close bc of resource leak warning
		i.close();

	}
}
