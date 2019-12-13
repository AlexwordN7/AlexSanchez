import java.util.Scanner;

public class Prueba {
	public static int suma(int operador1, int operador2) {
		int total =0;
		total=operador1+operador2;
		return total;
	}
	public static int resta(int operador1, int operador2) {
		int total =0;
		total=operador1+operador2;
		return total;
	}
	public static int multiplicacion(int operador1, int operador2) {
		int total =0;
		total=operador1+operador2;
		return total;
	}
	public static int division(int operador1, int operador2) {
		int total =0;
		total=operador1+operador2;
		return total;
	}
	public static int elevarNumero(int operador1, int operador2) {
		int total =0;
		total=operador1+operador2;
		return total;
	}

	public static void main(String[] args) {
		Scanner ejercicio1 =new Scanner(System.in);
		int numeros = 0;
		System.out.println("Introduce un numero");
		numeros=ejercicio1.nextInt();
		suma(numeros, numeros);
		resta(numeros,numeros);
		multiplicacion(numeros,numeros);
		division(numeros,numeros);
		elevarNumero(numeros,numeros);
		
	}

}
