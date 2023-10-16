import java.util.Scanner;

public class AtivFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantas vezes o ciclo irá se repetir");
		
		int N = sc.nextInt();
		
		int soma = 0; 
		
		for(int i = 1; i <= N; i++) {
			System.out.printf("Digite o número %d %n", i);
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println("SOMA TOTAL = " + soma);
		
		sc.close();
	}


}
