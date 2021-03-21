package CoreTopics;
class manager1 extends Thread {
	public void run() {
		System.out.println("Shweta Ma'am");
	}
}
class buddy1 extends Thread{
	public void run() {
		System.out.println("Lakshya Sir");
	}
}
class trainee1 extends Thread{
	public void run() {
		System.out.println("Prateek Haryani");
	}
}

public class ThreadDemo{
	public static void main(String[] args) {
		manager1 m = new manager1();
		buddy1 b = new buddy1();
		trainee1 t = new trainee1();
		m.start();
		b.start();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method");
		}
//		Lakshya Sir
//		Prateek Haryani
//		Shweta Ma'am
//		main method
//		main method
//		main method
//		main method
//		main method


	}
}