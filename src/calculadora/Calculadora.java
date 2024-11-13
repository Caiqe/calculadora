package calculadora;

public class Calculadora {

	private float numero1;
	private float numero2;


	public float getNumero1() {
		return numero1;
	}

	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}

	public float getNumero2() {
		return numero2;
	}

	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}

	public float somar(float num1, float num2) {

		float resultado = num1 + num2;
		return resultado;
	}

	public float subtrair(float num1, float num2) {
		float resultado = num1 - num2;
		return resultado;
	}

	public float multiplicar(float num1, float num2) {
		float resultado = num1 * num2;
		return resultado;
	}
	public float dividir(float num1, float num2) {
		if(num2==0) {
			System.out.println("Não é possivel fazer divisão por zero! Tente informar outro divisor!");
			return 0;
		}
		else {
			float resultado = num1/num2;
			return resultado;
		}
	}

}
