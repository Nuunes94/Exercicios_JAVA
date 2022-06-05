import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite o n�mero equivalente ao dia da semana:");
		int num = sc.nextInt();
		String diaDaSemana ;
		
		switch (num) {
		case 1:
			diaDaSemana = "domingo";
			break;
		case 2:
			diaDaSemana = "segunda-feira";
			break;
		case 3:
			diaDaSemana = "ter�a-feira";
			break;
		case 4:
			diaDaSemana = "quarta-feira";
			break;
		case 5:
			diaDaSemana = "quinta-feira";
			break;
		case 6:
			diaDaSemana = "sexta-feira";
			break;
		case 7:
			diaDaSemana = "s�bado";
			break;
		default:
			diaDaSemana = "valor invalido";
			break;		
		}
		System.out.printf("Dia da semana: %s",diaDaSemana);
		sc.close();
	}
}