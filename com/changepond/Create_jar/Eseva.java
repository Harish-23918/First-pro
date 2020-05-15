package com.changepond.Create_jar;

public class Eseva {
	public static void main(String[] ar) {
		Bill b;
		b = new ElectricityBill();
		double amt = b.calcBill(350);
		b.printBill(amt);
		b = new WaterBill();
		amt = b.calcBill(500);
		b.printBill(amt);
		b = new MobileBill();
		amt = b.calcBill(900);
		b.printBill(amt);
	}
}