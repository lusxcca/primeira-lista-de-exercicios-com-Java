package lista01;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio do c�rculo: ");
		int raio = sc.nextInt();
		float pi = 3.14f;
		float resultado = pi*(raio*raio);
		System.out.println("A �rea do c�rculo correspondente �: "+resultado);
		sc.close();
	}
	
}
