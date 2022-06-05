import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite um número:");
		double num = sc.nextDouble();
		
		if (num > 0 && num <= 25) {
			System.out.println("O intervalo está entre 0 e 25");
		}
		else if (num > 25 && num <= 50) {
			System.out.println("O intervalo está entre 25 e 50");
		}
		else if (num > 50 && num <= 75) {
			System.out.println("O intervalo está entre 50 e 75");
		}
		else if (num > 75 && num <= 100) {
			System.out.println("O intervalo está entre 75 e 100");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}		
}