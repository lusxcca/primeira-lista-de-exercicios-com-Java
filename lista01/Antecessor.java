package lista01;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		int resultado = valor-1;
		System.out.println("O n�mero antecessor ao valor correspondente �: "+resultado);
		sc.close();
	}
}
