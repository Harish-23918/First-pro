package com.changepond.Create_jar;

public class Refer_heap {

	public static void main(String[] args) {
	
		String str= new String("harish").intern();
		String str1= new String("harish").intern();
		if(str==str1) {
		System.out.println("same object");
		}
		else {
			System.out.println("different objects");
		}

	}

}
