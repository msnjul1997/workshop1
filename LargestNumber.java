package com.kittu;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int x,y,z,largest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		x=sc.nextInt();
		System.out.println("Enter the Second Number");
		y=sc.nextInt();
		System.out.println("Enter the third number");
		z=sc.nextInt();
		largest=z>(x>y?x:y)?z:((x>y)?x:y);
		System.out.println("The lagest number is:"+largest);
		
	}

}
