package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter Product Data");
		
		System.out.print("Name:");
		String name = sc.nextLine();
		
		System.out.print("Price:");
		double price = sc.nextDouble();
	
		// antes o produto era instanciado com seus valores vazios, agora seus valores estão preenchidos
		Product product = new Product(name, price);
		
		product.setName("Computador");
		
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200.99);
		System.out.println("Updated price: " + product.getPrice());	
		
		System.out.println(product.toString()); 
		
		System.out.print("Enter the number of products to be added in stock:");
		int	 quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println(product.toString()); 
		
		System.out.print("Enter the number of products to be deleted from stock:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println(product.toString()); 

		sc.close();
	}

}
