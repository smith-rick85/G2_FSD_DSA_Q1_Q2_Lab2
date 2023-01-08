package com.greatlearning.dsa.labsession2.Q1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Transaction transaction = new Transaction();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int array[] = new int[size];

		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++)
			array[i] = sc.nextInt();

		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();

		while (targetNo-- != 0) {
			int targetChecked = 0;

			System.out.println("Enter the value of target");
			long target = sc.nextInt();
			long sum = 0;

			for (int i = 0; i < size; i++) {
				sum += array[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions " + "\n");

					targetChecked = 1;
					break;
				}
			}
			if (targetChecked == 0) {
				System.out.println("Given target is not achieved");
			}
		}
	}
}
