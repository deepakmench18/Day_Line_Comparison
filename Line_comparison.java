package com.bridgelab.program;
import java.util.Scanner;
class Line_comparison 
{
	public static void main(String[] args)
	 {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter x1 first point: ");
	        int x1 = s.nextInt();
	        System.out.print("Enter y1  first point: ");
	        int y1 = s.nextInt();
	        System.out.print("Enter x2 second point: ");
	        int x2 = s.nextInt();
	        System.out.print("Enter y2  second point: ");
	        int y2 = s.nextInt();

	        System.out.print("Enter p1 first point: ");
	        int p1 = s.nextInt();
	        System.out.print("Enter q1 first point: ");
	        int q1 = s.nextInt();
	        System.out.print("Enter p2 second point: ");
	        int p2 = s.nextInt();
	        System.out.print("Enter q2 second point: ");
	        int q2 = s.nextInt();
	        Line_comparison line = new Line_comparison();
	        line.lengthOfLines(x1, y1, x2, y2, p1, q1, p2, q2);
	        }

	        private void lengthOfLines(int x1, int y1, int x2, int y2, int p1, int q1, int p2, int q2)
	        {
	        Double length_of_line1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	        Double length_of_line2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
	        System.out.printf("length of 1st end points are : %.2f %n", length_of_line1);
	        System.out.printf("length of 2nd end points are : %.2f %n", length_of_line2);
	        equal(length_of_line1, length_of_line2);
	        compare(length_of_line1, length_of_line2);
	        }

	    
	    private void equal(Double length_of_line1, Double length_of_line2) {
	        boolean check = length_of_line1.equals(length_of_line2);
	        if(check)
	            System.out.println("Both lines are equal.");
	        else
	            System.out.println("Both lines are not equal.");
	    }

	   
	    private void compare(Double length_of_line1, Double length_of_line2) {
	        int res = length_of_line1.compareTo(length_of_line2);
	        if(res > 0)
	            System.out.println("Length of first end points is greater than length of second end points");
	        else if(res < 0)
	            System.out.println("Length of first end points is less than length of second end points");
	        else
	            System.out.println("Both lines are equal.");
	    }
	}

