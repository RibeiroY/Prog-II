package exercicio_01B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_01B {
	public static void main(String[] argcs) {
		Set<Produto> listaDeProdutos = new HashSet<Produto>();

		int option, quantidade=1, ID;
		double price;
		String str;
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Deseja fazer qual tipo de opera��o? Inser��o ou impressao total?");
		System.out.println("Op��es: 1, 2, 3(sair)");
		option=sc.nextInt();
		do {
			switch(option) {
				case 1:
					sc.nextLine();
					System.out.println("Op��o escolhida: Inser��o.");
					System.out.println("Para parar de inserir, digite 0 apos a inser��o do ultimo nome ");
					System.out.println("Pressione ENTER");
					while(quantidade != 0) {
						sc.nextLine();
						System.out.println("Digite o nome do produto.");
						str=sc.next();
						
						System.out.println("Digite a ID do produto.");
						ID=sc.nextInt();
						System.out.println("Digite o pre�o do produto.");
						price=sc.nextDouble();
						
						if(listaDeProdutos.add(new Produto(ID, price, str))) {
							System.out.println("Produto inserido");
						}else {
							System.out.println("Produto ja cadastrado");
						}
						
						System.out.println("Digite agora qualquer numero diferente de 0(numero que encerra) para continuar.");
						quantidade = sc.nextInt();	
					}
					sc.nextLine();
					
					System.out.println("Opera��o encerrada. Digite agora o numero da opera��o que deseja fazer.");
					option=sc.nextInt();
					while(option==1) {
						sc.nextLine();
						System.out.println("Digite novamente. Voc� j� est� nessa opera��o.");
						option=sc.nextInt();
					}
					break;
					
				case 2:
					sc.nextLine();
					
					if(!listaDeProdutos.isEmpty()) {
						for(Produto corrente : listaDeProdutos) {
							System.out.println(corrente);
						}
					}else {
						System.out.println("Lista vazia!!!");
					}	
					
					
					System.out.println("Opera��o encerrada. Digite agora o numero da opera��o que deseja fazer.");
					option=sc.nextInt();
					
					while(option==4) {
						System.out.println("Digite novamente. Voc� j� est� nessa opera��o.");
						option=sc.nextInt();
					}
					break;
					
					
				default:
					System.out.println("Op��o inv�lida. Por favor, digite novamente.");
					option=sc.nextInt();
			
			
			}
					
			
		}while(option !=3);
		System.out.println("Programa encerrado");
		
		
		
	}

}
