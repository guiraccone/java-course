import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int hora;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora > 6 && hora < 12) {
			System.out.printf("Bom dia! São %d horas!", hora);
		} else if (hora > 12 && hora <= 18) {
			System.out.printf("Boa tarde! São %d horas!", hora);
		} else {
			System.out.printf("Boa noite! São %d horas!", hora);
		}

		sc.close();

	}
}
