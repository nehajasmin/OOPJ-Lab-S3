public class exp29multithread1 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable12(true); // isOdd = true
		Runnable r2 = new Runnable12(false);// isOdd = false
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}

class Runnable12 implements Runnable {
	private boolean isOdd;

	Runnable12(boolean isOdd) {
		this.isOdd = isOdd;
	}

	public void run() {
		if (isOdd) {
			for (int i = 1; i <= 101; i += 2) {
				System.out.println(i);
			}
		} else {
			for (int i = 0; i < 101; i += 2) {
				System.out.println(i);
			}
		}
	}
}
