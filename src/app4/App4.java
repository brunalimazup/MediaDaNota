package app4;

import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	
		System.out.println("Qual a sua primeira nota?");
		double nota1 = entrada.nextInt ();
		
		System.out.println("Qual a sua segunda nota?");
		double nota2 = entrada.nextInt ();
		
		System.out.println("Qual a sua terceira nota?");
		double nota3 = entrada.nextInt ();
		
		System.out.println("Qual a sua quarta nota?");
		double nota4 = entrada.nextInt ();
		
		double media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		if (media >= 7.0) {
			System.out.println("Parabéns você foi aprovado com a média de: " + media );
			
		} else {
			System.out.println("Poxa não foi dessa vez, infelizmente a sua nota não chegou a média, sua nota final foi de:" + media);
		}
	}
	
	

}
