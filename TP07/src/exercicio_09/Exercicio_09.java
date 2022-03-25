package exercicio_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_09 {
	
	public static void main(String[] argcs) {
		
		try {
			System.out.println("Iniciando m�todo 1");
			someMethod();
		}catch(ArithmeticException e){
			System.out.println("Erro de Aritmetica: n�o existe divis�o por zero");
			e.printStackTrace();
		}catch(InputMismatchException f) {
			System.out.println("Erro: espa�o digitado n�o corresponde ao tipo de vari�vel declarada.");
			f.printStackTrace();
		}
		
		
	}
	public static void someMethod() {
		System.out.println("Iniciando m�todo 2");
		someMethod2();
		
	}
	public static void someMethod2() {
		Scanner keyboard = new Scanner(System.in);
		int x, y;
		double r;
		System.out.println("Informe o primeiro valor.");
		x = keyboard.nextInt();
		System.out.println("Informe o segundo valor.");
		y=keyboard.nextInt();
		r = (x/y);
		System.out.println("O resultado da divis�o � " + r);
	}

}
/*try{
	x = teclado.nextInt();
	System.out.println("Informe o segundo valor");
	y=teclado.nextInt();
	r = (x/y);
	System.out.println("O resultado da soma � " + r);
}catch(ArithmeticException e){
	System.out.println("Erro de Aritmetica: n�o existe divis�o por zero");
}catch(InputMismatchException f) {
	System.out.println("Erro: espa�o digitado n�o corresponde ao tipo de vari�vel declarada.");
}*/