import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o número: ");
		int num = sc.nextInt();
		
		System.out.println("É negativo ou positivo? ");
		System.out.println();
		
		if (num >= 1) {
			System.out.println("Número é positivo!");		
		}		
		else if (num == 0) {
			System.out.println("Número é neutro!");
		}
		else {
			System.out.println("Número é negativo!");
		}
		sc.close();
	}		
}