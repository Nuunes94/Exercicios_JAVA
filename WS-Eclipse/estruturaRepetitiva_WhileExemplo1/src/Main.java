import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de X:");
		int x = sc.nextInt();
		System.out.println("Digite o valor de Y:");
		int y = sc.nextInt();		
		
		while (x != y) {
			if (x < y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrescente");
			}
			System.out.println("Digite o valor de X:");
			x = sc.nextInt();
			System.out.println("Digite o valor de Y:");
			y = sc.nextInt();
		}
		System.out.println("Terminou");
		sc.close();
	}
}
