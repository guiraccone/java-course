package application;

import java.util.Scanner;

import entities.Fibonacci;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fibonacci fibonacci = new Fibonacci();

		System.out.println("Digite quantas repetições ocorrerão");
		int repetitions = sc.nextInt();
		
		fibonacci.fibonacciSequence(repetitions);

		sc.close();
	}

}
