package threads;

public class Hilo2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i <=5; i++) {
			System.out.println("Flujo2");
		}
	}
}
