package exercicio_10E;

import java.util.Scanner;

public class Exercicio_10E {
	public static void main(String[] argcs) {
		int option;
		Calculator operacao = new Calculator();
		double n1,n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja trabalhar com divisão ou logarítmo? 1 para divisão ou 2 para logarítmo.");
		option = sc.nextInt();
		switch(option) {
			case 1:
				System.out.println("Digite o numerador.");
				n1=sc.nextDouble();
				System.out.println("Digite o denominador");
				n2=sc.nextDouble();
				operacao.div(n1,n2);
				break;
			case 2:
				System.out.println("Digite o numero a ser submetido.");
				n1=sc.nextDouble();
				operacao.log10(n1);
				break;
			default:
				System.out.println("Operador invalido.");
		}
	}
}
