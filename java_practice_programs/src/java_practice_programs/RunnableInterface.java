package java_practice_programs;

class SitaThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("\t\t from sita thread" + i);
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		SitaThread sita = new SitaThread();
		Thread t = new Thread(sita);
		t.start();
		for (int i = 1; i < 10; i++) {
			System.out.println("from Ram Thread" + i);
		}

	}

}
 