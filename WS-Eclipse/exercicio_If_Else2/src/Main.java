import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o número: ");
		int num = sc.nextInt();
		
		System.out.println("É par ou impar? ");
		System.out.println();
		
		if (num % 2 == 0 )  {
			System.out.println("Número é par!");		
		}		
		else {
			System.out.println("Número é impar!");
		}
		sc.close();
	}		
}