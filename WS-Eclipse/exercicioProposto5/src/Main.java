import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca = sc.nextInt();
		int numPeca = sc.nextInt();
		double valor1 = sc.nextDouble();
		int codigoPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double totalAPagar = (numPeca * valor1 + numPeca2 * valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n", totalAPagar);
		
		sc.close();
	}

}
