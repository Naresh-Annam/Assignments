package com.Factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter anumber to find its Factorial");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		System.out.println(num+" factorial value is "+factorial);
		sc.close();

	}
}
