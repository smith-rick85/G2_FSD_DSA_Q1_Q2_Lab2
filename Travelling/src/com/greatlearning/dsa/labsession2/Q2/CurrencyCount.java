package com.greatlearning.dsa.labsession2.Q2;

public class CurrencyCount {

	public void currencyCount(int currency[], int amount) {

		int currencyCounter[] = new int[currency.length];

		for (int i = 0; i < currency.length; i++) {
			if (amount >= currency[i]) {
				currencyCounter[i] = amount / currency[i];
				amount = amount % currency[i];
			}
		}
		if (amount > 0)

			System.out.println("Exact amount cannot be given with the given currency");

		else {
			System.out.println("Your payment approach in order to give min: ");

			for (int i = 0; i < currency.length; i++) {
				if (currencyCounter[i] != 0)
					System.out.println(currency[i] + ":" + currencyCounter[i]);
			}
		}
	}
}
