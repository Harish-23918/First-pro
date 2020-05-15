package com.changepond.Create_jar;

/**
 * total billing system confirance
 */
public class ElectricityBill implements Bill {
	public double calcBill(int units) {
		double amt = units * 5.67;
		return amt;
	}

	public void printBill(double amt) {
		System.out.println("Bill:" + amt);
	}
}
