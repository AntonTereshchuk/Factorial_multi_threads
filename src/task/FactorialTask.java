package task;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
	
	private int number;
			
	public FactorialTask(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	public BigInteger CalculateFactorialOfNumber(int number) {
		
		if (number == 0) {
			return BigInteger.ZERO;
		}
		
		BigInteger factorialOfNumber = BigInteger.ONE;
		
		for (int i = 1; i <= number; i++) {
			factorialOfNumber = factorialOfNumber.multiply(BigInteger.valueOf(i));
		}
		
		return factorialOfNumber;
		
	}

	@Override
	public void run() {
		
		Thread thread = Thread.currentThread();
		BigInteger factorial = CalculateFactorialOfNumber(number);		
		System.out.println(thread.getName() + " " + number + "!= " + factorial);
		
	}
	
}
