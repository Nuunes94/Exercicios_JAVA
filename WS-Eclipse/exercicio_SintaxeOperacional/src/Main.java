import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite os minutos utilizados pelo usuario:");
		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		System.out.printf("Valor a pagar: R$%.2f", conta);		
		sc.close();
	}		
}