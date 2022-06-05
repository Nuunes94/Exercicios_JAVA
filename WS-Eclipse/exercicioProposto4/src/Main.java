import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHoraTrabalhada = sc.nextDouble();
		double salario = horasTrabalhadas * valorPorHoraTrabalhada;
				
		System.out.println("FUNCIONARIO = " + funcionario);
		System.out.printf("SALARIO = R$ %.2f%n", salario);
		
		sc.close();
	}

}
