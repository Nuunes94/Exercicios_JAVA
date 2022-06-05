import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("DEMONSTRAÇÃO");
		
		double preco = sc.nextDouble();
		double desconto;
		
		if (preco < 20) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		System.out.println("R$" + desconto);
		sc.close();
	}
}