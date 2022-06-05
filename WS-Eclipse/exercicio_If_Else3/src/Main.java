import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("É multiplo ou não? ");
		System.out.println();
		
		if (num % num2 == 0 || num2 % num ==0)  {
			System.out.println("É multiplo!");		
		}		
		else {
			System.out.println("Não é multiplo!");
		}
		sc.close();
	}		
}