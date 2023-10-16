package entities;

public class Fibonacci {
	public int value1;
	public int value2;
	
	public void fibonacciSequence(int repetitions) {
		this.value1 = 0;
		this.value2 = 1;
		
		int i = 0;
		
		while(i  < repetitions) {
			System.out.printf("%d %d ", value1, value2);
			value1 += value2;
			value2 += value1;
			
			i++;
		}
	}
	
}
