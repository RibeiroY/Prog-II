package exercicio_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_05 {
	public static void main(String[] argcs) {
		int x,y;
		double r;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Eu sei dividir!");
		System.out.println("Informe o primeiro valor");
		try{
			x = teclado.nextInt();
			System.out.println("Informe o segundo valor");
			y=teclado.nextInt();
			r = (x/y);
			System.out.println("O resultado da divis�o � " + r);
		}catch(ArithmeticException e){
			System.out.println("Erro de Aritmetica: n�o existe divis�o por zero");
		}catch(InputMismatchException f) {
			System.out.println("Erro: espa�o digitado n�o corresponde ao tipo de vari�vel declarada.");
		}
	}

}
