package lista01;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um dos lados do quadrado: ");
		int lado = sc.nextInt();
		int areaQ = lado*lado;
		System.out.println("A �rea do quadrado correspondente �: "+areaQ);
		sc.close();
	}
}
