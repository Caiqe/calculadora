package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	Scanner sc = new Scanner(System.in);


	public float somaNumeros(float num1, float num2) {

		float resultado = num1 + num2;
		return resultado;
	}

	public float subtraiNumeros(float num1, float num2) {
		float resultado = num1 - num2;
		return resultado;
	}

	public float multiplicaNumeros(float num1, float num2) {
		float resultado = num1 * num2;
		return resultado;
	}
	public float dividiNumeros(float num1, float num2) {
		if(num2==0) {
			System.out.println("Não é possivel fazer divisão por zero! Tente informar outro divisor!");
			return 0;
		}
		else {
			float resultado = num1/num2;
			return resultado;
		}
	}
	
	public void somar() {
		System.out.println("+--------------------------------------------+");
		System.out.println("|                   Soma                     |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|         Informe o Primeiro valor:          |");
		System.out.println("|                                            |");
		 float num1 = sc.nextFloat();
		System.out.println("|                                            |");
		System.out.println("|         Informe o Segundo valor:           |");
		System.out.println("|                                            |");
		float num2= sc.nextFloat();
		
		System.out.println("O resultado da soma é: "+this.somaNumeros(num1, num2));
	}
	public void subtrair() {
		System.out.println("+--------------------------------------------+");
		System.out.println("|                  Subtração                 |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|         Informe o Primeiro valor:          |");
		System.out.println("|                                            |");
		 float num1 = sc.nextFloat();
		System.out.println("|                                            |");
		System.out.println("|         Informe o Segundo valor:           |");
		System.out.println("|                                            |");
		float num2= sc.nextFloat();
		
		System.out.println("O resultado da subtração é: "+this.subtraiNumeros(num1, num2));
	}
	public void dividir() {
		System.out.println("+--------------------------------------------+");
		System.out.println("|                   Divisão                  |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|         Informe o Primeiro valor:          |");
		System.out.println("|                                            |");
		 float num1 = sc.nextFloat();
		System.out.println("|                                            |");
		System.out.println("|         Informe o Segundo valor:           |");
		System.out.println("|                                            |");
		float num2= sc.nextFloat();
		
		System.out.println("O resultado da divisão é: "+this.dividiNumeros(num1, num2));
	}
	public void multiplicar() {
		System.out.println("+--------------------------------------------+");
		System.out.println("|               Multiplicação                |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|         Informe o Primeiro valor:          |");
		System.out.println("|                                            |");
		 float num1 = sc.nextFloat();
		System.out.println("|                                            |");
		System.out.println("|         Informe o Segundo valor:           |");
		System.out.println("|                                            |");
		float num2= sc.nextFloat();
		
		System.out.println("O resultado da multiplicação é: "+this.multiplicaNumeros(num1, num2));
	}

}
