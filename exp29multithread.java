public class exp29multithread {
    public static void main(String[] args) {
        Runnable r1 = new Runnable1();
        Runnable r2 = new Runnable2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}

class Runnable1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 101; i += 2) {
            System.out.println(i);
        }
    }
}

class Runnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 101; i += 2) {
            System.out.println(i);
        }
    }
}
