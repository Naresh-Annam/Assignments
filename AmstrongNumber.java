package com.AmstrongNumber;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter A Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num;
		int num2 = num;
		int num3 = num;
		int sum = 0;
		int count = 0;
		sc.close();
		while (num1 != 0) {
			num1 = num1 / 10;
			count++;
		}
		while (num2 > 0) {
			num3 = num2 % 10;
			sum += Math.pow(num3, count);
			num2 = num2 / 10;
		}
		if (sum == num) {
			System.out.println(num + " is an Amstrong Number");
		} else
			System.out.println(num + " is not an Amstrong Number");

	}

}
