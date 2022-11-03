package com.Bridgelabz;

import java.util.Scanner;

public class LineCompare {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter the value of x1 and y1: ");
	int x1=input.nextInt();
	int y1=input.nextInt();
	
	System.out.print("Enter the value of x2 and y2: ");
	int x2=input.nextInt();
	int y2=input.nextInt();
	
	double length1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	System.out.println("Length of Line1 is: "+length1);
	
  }
}
