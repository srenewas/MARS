package com.seenu.MultiThreadding;

class A{
	public static synchronized void message(String msg) {
		System.out.println(msg);
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
            e.printStackTrace();
		}
	}
}
class mythread1 extends Thread{
	public void run() {
		A.message(" I");
	}
}
class mythread2 extends Thread{
	public void run() {
		A.message("LOVE");
	}
}
class mythread3 extends Thread{
	public void run() {
		A.message(" U");
	}
}
public class Display {
	public static void main(String[] args) throws Exception {
		mythread1 mt1 = new mythread1();
		mythread2 mt2 = new mythread2();
		mythread3 mt3 = new mythread3();
		mt1.start();
			mt1.join();
		mt2.start();
			mt2.join();
		mt3.start();
	}
}
