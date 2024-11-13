package testeCalculadora;

import java.io.IOException;
import java.util.Scanner;

import calculadora.Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		Scanner sc = new Scanner(System.in);

		int opcao;
		float num1, num2;

		do {

			System.out.println("+--------------------------------------------+");
			System.out.println("|                 Calculadora                |");
			System.out.println("|--------------------------------------------|");
			System.out.println("|                                            |");
			System.out.println("|       Digite 1 Inicar A Calculadora        |");
			System.out.println("|                     OU                     |");
			System.out.println("|        0 Para Fechar a Calculadora         |");
			System.out.println("|                                            |");
			System.out.println("+--------------------------------------------+");

			opcao = sc.nextInt();
			switch (opcao) {
			case 1 -> {
				menuOperador();
				int operador  = sc.nextInt();
				
				switch(operador) {
				case 1->{
					System.out.println("+--------------------------------------------+");
					System.out.println("|                 Calculadora                |");
					System.out.println("|--------------------------------------------|");
					System.out.println("|         Informe o Primeiro valor:          |");
					System.out.println("|                                            |");
					num1 = sc.nextFloat();
					System.out.println("|                                            |");
					System.out.println("|         Informe o Segundo valor:           |");
					System.out.println("|                                            |");
					num2 = sc.nextFloat();
				}
				case 2->{
					
				}
				case 3->{
					
				}
				case 4->{
					
				}
				default->{
					
				}
				}
				
			}
			case 0 -> {

			}
			default -> {
				System.out.println("Opção inválida!");
			}
			}

		} while (opcao != 0);

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
		System.out.println("+--------------------------------------------+");
		System.out.println("|                 Calculadora                |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|                                            |");
		System.out.println("|        Qual operação deseja realizar?      |");
		System.out.println("|                                            |");
		System.out.println("|              [1] - Soma                    |");
		System.out.println("|              [2] - Subtração               |");
		System.out.println("|              [3] - Divsão                  |");
		System.out.println("|              [4] - Multiplicação           |");
		System.out.println("|                                            |");
		System.out.println("+--------------------------------------------+");
	}
	
}
