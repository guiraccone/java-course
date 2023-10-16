package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width");
		rectangle.width = sc.nextDouble();
		
		System.out.println("Enter rectangle height");
		rectangle.height = sc.nextDouble();
		
		System.out.printf("%n AREA = %.2f %n PERIMETER = %.2f %n DIAGONAL = %.2f", 
				rectangle.area(), rectangle.perimeter(), rectangle.diagonal());
		
		sc.close();
	}

}
