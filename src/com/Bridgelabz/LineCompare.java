package com.Bridgelabz;

import java.util.Scanner;

public class LineCompare {

	//Line Comparison Using Methods
	int x1, x2, y1, y2, a1, a2, b1, b2;
	double dis, dis1;

	public void display()
	{
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void firstLineLength(int x1,int x2,int y1,int y2)
	{
		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")-->" + dis);
		System.out.println();
	}

	public void secondLineLength(int a1,int a2,int b1, int b2) 
	{
		dis1 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("distance between" + "(" + a1 + "," + a2 + ")," + "(" + b1 + "," + b2 + ")-->" + dis1);
	}

	
	public void isEqualLine()
	{
		String line_1=String.valueOf(dis);
		String line_2=String.valueOf(dis1);
		System.out.println();
		if(line_1.equals(line_2))
		{
			System.out.println("both lines are equal");
		}
		else 
		{
			System.out.println("both lines are not equal");
		}
	}

	
	public void lineComparison()
	{
		System.out.println();
		if (Double.compare(dis, dis1) == 0) 
		{
			System.out.println("Both Lines are equal");
		} 
		else if (Double.compare(dis, dis1) < 0)
		{
			System.out.println("line1 is less than line2");
		} 
		else 
		{
			System.out.println("line1 is greater than line2");
		}
	}
	
	public static void main(String[] args)
	{
		LineCompare obj=new LineCompare();
		obj.display();
		obj.firstLineLength(30, 20, 80, 10);
		obj.secondLineLength(20,60,50,10);
		obj.isEqualLine();
		obj.lineComparison();
		
	}
}

    
	/*//Line Comparison without Methods
	 * 
	 * public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter the value of x1 and y1: ");
	int x1=input.nextInt();
	int y1=input.nextInt();
	
	System.out.print("Enter the value of x2 and y2: ");
	int x2=input.nextInt();
	int y2=input.nextInt();
	
	double length1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	System.out.println("Length of Line1 is: "+length1);
	
	System.out.print("Enter the value of x3 and y3: ");
	int x3=input.nextInt();
	int y3=input.nextInt();
	
	System.out.print("Enter the value of x4 and y4: ");
	int x4=input.nextInt();
	int y4=input.nextInt();
	
	double length2=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
	System.out.println("Length of Line2 is: "+length2);
	
	String line1=String.valueOf(length1);
	String line2=String.valueOf(length2);
	
	if(Double.compare(length1, length2) == 0)
	{
		System.out.println("Both Lines are equal");
    }
    else if (Double.compare(length1, length2) < 0)
    {
        System.out.println("line1 is less than line2");
    }
    else 
    {
        System.out.println("line1 is greater than line2");
    }
  }
}*/
