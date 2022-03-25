package exercicio_01;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Exercicio_01 {
	public static void main(String[] argcs) {
		
		Set<String> listaDeNomes = new HashSet<String>();
		String nome= new String();
		int option, quantidade;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja fazer qual tipo de operação? Inserção, pesquisa, exclusão ou impressao total?");
		System.out.println("Opções: 1, 2, 3, 4, 5(sair)");
		
		option=sc.nextInt();
		
		do {
			switch(option) {
				case 1:
					sc.nextLine();
					System.out.println("Opção escolhida: Inserção.");
					quantidade = 1;
					System.out.println("Para parar de inserir, digite 0 apos a inserção do ultimo nome ");
					System.out.println("Pressione ENTER");
					while(quantidade != 0) {
						sc.nextLine();
						System.out.println("Digite um nome");
						nome = sc.nextLine();
						listaDeNomes.add(nome);
						System.out.println("Digite agora qualquer numero diferente de 0(que para de inserir) para continuar.");
						quantidade = sc.nextInt();
						
					}
					sc.nextLine();
					
					System.out.println("Operação encerrada. Digite agora o numero da operação que deseja fazer.");
					option=sc.nextInt();
					while(option==1) {
						sc.nextLine();
						System.out.println("Digite novamente. Você já está nessa operação.");
						option=sc.nextInt();
					}
					break;
					
				case 2:
					sc.nextLine();
					System.out.println("Opção escolhida: Pesquisa. Digite agora o nome que deseja pesquisar.");
					nome=sc.nextLine();
					listaDeNomes.contains(nome);
					if(listaDeNomes.contains(nome)) {
						System.out.println("Nome inserido.");
					}else {
						System.out.println("Nome não encontrado.");
					}
					sc.nextLine();
					System.out.println("Operação encerrada. Digite agora o numero da operação que deseja fazer.");
					option=sc.nextInt();
					while(option==2) {
						System.out.println("Digite novamente. Você já está nessa operação.");
						option=sc.nextInt();
					}
					break;
		
				case 3:
					sc.nextLine();
					System.out.println("Opção escolhida: Exclusão. Digite 0 para excluir todos ou qualquer outro numero para um nome em especifico.");
					quantidade = sc.nextInt();
					
					if(quantidade!=0) {
						System.out.println("Digite o nome.");
						sc.nextLine();
						nome=sc.nextLine();
						if(listaDeNomes.contains(nome)) {
							listaDeNomes.remove(nome);
							System.out.println("Nome removido");
						}else {
							System.out.println("Nome não encontrado");
						}
						
					}else{
						sc.nextLine();
						listaDeNomes.clear();
						System.out.println("Todos os nomes removidos.");
					}	
					
					System.out.println("Operação encerrada. Digite agora o numero da operação que deseja fazer.");
					option=sc.nextInt();
					while(option==3) {
						System.out.println("Digite novamente. Você já está nessa operação.");
						option=sc.nextInt();
					}
					break;
				case 4:
					sc.nextLine();
					for(String corrente : listaDeNomes) {
						System.out.println(corrente);
					}
					System.out.println("Operação encerrada. Digite agora o numero da operação que deseja fazer.");
					option=sc.nextInt();
					
					while(option==4) {
						System.out.println("Digite novamente. Você já está nessa operação.");
						option=sc.nextInt();
					}
					break;
					
					
				default:
					System.out.println("Opção inválida. Por favor, digite novamente.");
					option=sc.nextInt();
			
			
			}
					
			
		}while(option !=5);
		System.out.println("Programa Encerrado.");
		
	}

	
}
