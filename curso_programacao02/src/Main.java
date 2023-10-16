import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		/* 
				DOUBLE 
		double x;	
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f", x);
		*/
		
		/* 
		 * CHAR
		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		*/
		
		/*
		 * VARIOS DADOS JUNTOS
		 * 
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		*/
		
		String s1, s2, s3;
		int x; 
		
		// next só uma palavra, nextLine lê uma linha inteira.
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		

	}

}
