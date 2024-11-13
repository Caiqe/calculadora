package testeCalculadora;

import java.io.IOException;
import java.util.Scanner;

import calculadora.Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		Scanner sc = new Scanner(System.in);

		int operador;

		do {

			menuOperador();
			operador = sc.nextInt();

			switch (operador) {
			case 1 -> {
				calculadora.somar();
			}
			case 2 -> {
				calculadora.subtrair();
			}
			case 3 -> {
				calculadora.dividir();
			}
			case 4 -> {
				calculadora.multiplicar();
			}
			default -> {

			}
			}

		} while (operador != 0);
		sc.close();
	}

	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

	public static void menuOperador() {
		System.out.println(" +--------------------------------------------+ ");
		System.out.println(" |                 Calculadora                | ");
		System.out.println(" |--------------------------------------------| ");
		System.out.println(" |                                            | ");
		System.out.println(" |        Qual operação deseja realizar?      | ");
		System.out.println(" |                                            | ");
		System.out.println(" |              [1] - Soma                    | ");
		System.out.println(" |              [2] - Subtração               | ");
		System.out.println(" |              [3] - Divsão                  | ");
		System.out.println(" |              [4] - Multiplicação           | ");
		System.out.println(" |              [0] - Sair                    | ");
		System.out.println(" |                                            | ");
		System.out.println(" +--------------------------------------------+ ");

	}

}
