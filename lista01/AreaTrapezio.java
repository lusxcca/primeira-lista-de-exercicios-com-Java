package lista01;

import java.util.Scanner;

public class AreaTrapezio {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da base maior do trap�zio: ");
		int bMaior = sc.nextInt();
		System.out.println("Informe o valor da base menor do trap�zio: ");
		int bMenor = sc.nextInt();
		System.out.println("Informe a altura do trap�zio: ");
		int altura = sc.nextInt();
		int resultado = (bMaior+bMenor) * altura / 2;
		System.out.println("A �rea do trap�zio correspondente �: "+resultado);
		sc.close();
		
	}
}
