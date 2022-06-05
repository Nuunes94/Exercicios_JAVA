import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("SEJA BEM VINDO AO LANCHES DO LUC�O");
		System.out.println();
		System.out.println("Digite o codigo do item: ");
		int codigo = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		System.out.println();
		double total = 0;
		
		if (codigo == 1) {			
			total = quantidade * 4.00;
			System.out.printf("Voc� comprou %d CACHORRO QUENTE e gastou R$%.2f reais", quantidade, total);
		}
		else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Voc� comprou %d X-SALADA e gastou R$%.2f reais", quantidade, total);
		}
		else if (codigo == 3) {
			total = quantidade * 5.00;
			System.out.printf("Voc� comprou %d X-BACON e gastou R$%.2f reais", quantidade, total);
		}
		else if (codigo == 4) {
			total = quantidade * 2.00;
			System.out.printf("Voc� comprou %d TORRADA SIMPLES e gastou R$%.2f reais", quantidade, total);
		}
		else if (codigo == 5) {
			total = quantidade * 1.50;
			System.out.printf("Voc� comprou %d REFRIGERANTE e gastou R$%.2f reais", quantidade, total);
		}		
		sc.close();
	}		
}