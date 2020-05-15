package com.changepond.Create_jar;

public class WaterBill implements Bill {
	public double calcBill(int units) {
		double amt = units * 1.23;
		return amt;
	}

	public void printBill(double amt) {
		System.out.println("Bill:" + amt);
	}
}
