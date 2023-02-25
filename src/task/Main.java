package task;

public class Main {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());

		Thread[] threads = new Thread[10];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new FactorialTask(i));
			threads[i].start();
		}
	
	}

}
