import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o n�mero: ");
		int num = sc.nextInt();
		
		System.out.println("� negativo ou positivo? ");
		System.out.println();
		
		if (num >= 1) {
			System.out.println("N�mero � positivo!");		
		}		
		else if (num == 0) {
			System.out.println("N�mero � neutro!");
		}
		else {
			System.out.println("N�mero � negativo!");
		}
		sc.close();
	}		
}