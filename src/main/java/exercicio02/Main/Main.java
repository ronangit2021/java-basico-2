package exercicio02.Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main ();
		app.start();
		

	}

	private void start() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		double valor = ler.nextDouble();
		
		int valorComCast = (int) valor;
		
		System.out.println("O valor da variável é: " + valor + "|valor com cast: " + valorComCast);
		
		
		
		
		
		
		
		
	}

}
