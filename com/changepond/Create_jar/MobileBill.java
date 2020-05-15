package com.changepond.Create_jar;

public class MobileBill implements Bill {
	public double calcBill(int units) {
		double amt = units * 0.25;
		return amt;
	}

	public void printBill(double amt) {
		System.out.println("Bill:" + amt);
	}
}
