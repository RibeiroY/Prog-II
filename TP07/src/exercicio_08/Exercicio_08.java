package exercicio_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_08 {
	
	public static void main(String[] argcs) {
		System.out.println("Iniciando m�todo 1");
		
		try {
			metodo1();
		}catch(InputMismatchException f) {
			System.out.println("Erro: espa�o digitado n�o corresponde ao tipo de vari�vel declarada.");
			f.printStackTrace();
		}
		
		System.out.println("Encerrando programa.");
	}
	
	
	public static void metodo1() {
		int x,y;
		double r;
		Scanner teclado = new Scanner(System.in);
		try{
			System.out.println("Informe o primeiro valor");
			x = teclado.nextInt();
			System.out.println("Informe o segundo valor");
			y=teclado.nextInt();
			r = (x/y);
			System.out.println("O resultado da soma � " + r);
		}catch(ArithmeticException e){
			System.out.println("Erro de Aritmetica: n�o existe divis�o por zero.");
			e.printStackTrace();
			
		}
	}

}
