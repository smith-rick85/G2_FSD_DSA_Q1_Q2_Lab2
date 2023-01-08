package com.greatlearning.dsa.labsession2.Q2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		MergeSort mergeSort = new MergeSort();
		CurrencyCount currencyCount = new CurrencyCount();

		System.out.println("Enter the size of currency denomination: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] currency = new int[size];
		System.out.println("Enter the currency denomination value: ");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();

		mergeSort.sort(currency, 0, currency.length - 1);
		currencyCount.currencyCount(currency, amount);
	}
}
