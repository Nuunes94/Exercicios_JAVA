import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite o número equivalente ao dia da semana:");
		int num = sc.nextInt();
		String diaDaSemana;
		
		if (num == 1) {
			diaDaSemana = "Segunda-feira";
		}
		else if (num == 2) {
			diaDaSemana = "Terça-feira";
		}
		else if (num == 3) {
			diaDaSemana = "Quarta-feira";
		}
		else if (num == 4) {
			diaDaSemana = "Quinta-feira";
		}
		else if (num == 5) {
			diaDaSemana = "Sexta-feira";
		}
		else if (num == 6) {
			diaDaSemana = "Sábado";
		}
		else if (num == 7) {
			diaDaSemana = "Domingo";
		}
		else {
			diaDaSemana = "Valor inválido";
		}
		System.out.printf("Dia da semana: %s", diaDaSemana);		
		sc.close();
	}		
}