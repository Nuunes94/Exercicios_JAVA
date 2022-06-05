import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha = 32313574;
		System.out.println("DIGITE A SENHA:");
		int digitaSenha = sc.nextInt();

		while (senha != digitaSenha) {
			System.out.println("Senha Invalida");
			digitaSenha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}
}
