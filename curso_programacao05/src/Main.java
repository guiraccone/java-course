import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 0) {
			if (x < 0) {
				x++;
				System.out.println(x);
			}
			else {
				x--;
				System.out.println(x);
			}
		}

		sc.close();
	}

}
