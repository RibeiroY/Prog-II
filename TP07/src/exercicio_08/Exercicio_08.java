package exercicio_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_08 {
	
	public static void main(String[] argcs) {
		System.out.println("Iniciando método 1");
		
		try {
			metodo1();
		}catch(InputMismatchException f) {
			System.out.println("Erro: espaço digitado não corresponde ao tipo de variável declarada.");
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
			System.out.println("O resultado da soma é " + r);
		}catch(ArithmeticException e){
			System.out.println("Erro de Aritmetica: não existe divisão por zero.");
			e.printStackTrace();
			
		}
	}

}
