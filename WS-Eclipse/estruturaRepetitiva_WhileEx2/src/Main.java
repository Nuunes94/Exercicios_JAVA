import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("PRIMEIRO");
			} else if (x < 0 && y > 0) {
				System.out.println("SEGUNDO");
			} else if (x < 0 && y < 0) {
				System.out.println("TERCEIRO");
			} else {
				System.out.println("QUARTO");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("TERMINOU");
		sc.close();
	}
}
