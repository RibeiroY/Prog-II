package exercicio_10;

import java.util.Scanner;

import exercicio_07.ContaExcecao;

public class Exercicio_10 {
	
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
				try {
					operacao.div(n1,n2);
				}catch(InvalidOperationException f){
					System.out.println(f.getMessage());
					f.printStackTrace();
				}
				
				
				
				break;
			case 2:
				System.out.println("Digite o numero a ser submetido.");
				n1=sc.nextDouble();
				try{
					operacao.log10(n1);
				}catch(InvalidOperationException e){
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
				break;
			default:
				System.out.println("Operador invalido.");
		}
		
		
		
		
	}

}
