import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite o seu salario:");
		double salario = sc.nextDouble();
		double valorImposto;
		
		if(salario <= 2000.00) {
			valorImposto = 0.0;
		}
		else if(salario <= 3000.00) {
			valorImposto = (salario - 2000.00) * 0.08;			
		}
		else if(salario <= 4500.00) {
			valorImposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;			
		}
		else{
			valorImposto = (salario - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;  
		}
		if (valorImposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", valorImposto);
		}		
		sc.close();
	}		
}