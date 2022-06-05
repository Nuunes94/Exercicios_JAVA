import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a hora inicial: ");
		int horaInicial = sc.nextInt();
		System.out.println("Digite a hora final: ");
		int horaFinal = sc.nextInt();
		
		System.out.println("Qual a duração do jogo em horas?");
		System.out.println();
		
		int duracao;
		
		if (horaInicial < horaFinal)  {			
			duracao = horaFinal - horaInicial;					
		}		
		else {
			duracao = 24 - horaInicial + horaFinal;			
		}
		
		System.out.printf("O jogo durou %d horas", duracao);
		sc.close();
	}		
}