package lista01;

import java.util.Scanner;

public class AreaTriangulo {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do tri�ngulo: ");
		int base = sc.nextInt();
		System.out.println("Digite a largura do tri�ngulo: ");
		int altura = sc.nextInt();
		int areaT = (base*altura)/2;
		System.out.println("A �rea do tri�ngulo �: "+areaT);
		sc.close();
	}
}
