import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("DEMONSTRAÇÃO2");
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("R$" + desconto);
		sc.close();
	}
}