import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = sc.nextInt();
		
		System.out.println("� multiplo ou n�o? ");
		System.out.println();
		
		if (num % num2 == 0 || num2 % num ==0)  {
			System.out.println("� multiplo!");		
		}		
		else {
			System.out.println("N�o � multiplo!");
		}
		sc.close();
	}		
}