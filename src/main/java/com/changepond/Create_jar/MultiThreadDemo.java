package com.changepond.Create_jar;

class MultiThread implements Runnable {
	String name;

	MultiThread(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + ":" + i);
		}
	}
}

class MultiThreadDemo {
	public static void main(String[] ar) {
		MultiThread mt1 = new MultiThread("Thread1");
		MultiThread mt2 = new MultiThread("Thread2");
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main:" + i);
		}
	}
}