package lista01;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a base do ret�ngulo: ");
		int base = sc.nextInt();
		System.out.println("Informe a altura do ret�ngulo");
		int altura = sc.nextInt();
		int areaR = base*altura;
		System.out.println("A �rea do ret�ngulo correspondente �: "+areaR);
		sc.close();
	}
	
}
