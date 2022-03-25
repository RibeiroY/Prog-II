package exercicio_02B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio_02B {
	public static void main(String[] argcs) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Funcionario> mapa = new HashMap<String, Funcionario>();
		String str,str2,str3,str4;
		String a;
		
		System.out.println("Digite os dados do funcionário e em seguida suas respectivas chaves.");
		a="sim";
		while(a.equals("sim")) {
			System.out.println("Nome:");
			str=sc.nextLine();
			System.out.println("Cargo:");
			str3=sc.nextLine();
			System.out.println("Salário");
			str4=sc.nextLine();
			System.out.println("Chave:");
			str2=sc.nextLine();
			str2=str2.toUpperCase();
			while(mapa.containsKey(str2)) {
				System.out.println("Chave já inserida. Digite novamente.");
				str2=sc.nextLine();
				str2=str2.toUpperCase();
			}
			mapa.put(str2, new Funcionario(str,str3,str4));
			System.out.println("Digite 'sim' se quiser continuar inserindo.");
			a=sc.next();
			sc.nextLine();
			
		}
		
		
		
		
		a="sim";
		while(a.equals("sim")) {
			System.out.println("Digite a chave do funcionário que deseja recuperar.");
			str2=sc.nextLine();
			str2=str2.toUpperCase();
			if(mapa.containsKey(str2)) {
				System.out.println(mapa.get(str2));
			}else {	
				System.out.println("Funcionário não encontrado.");
			}
			System.out.println("Digite 'sim' se quiser continuar pesquisando.");
			a=sc.next();
			sc.nextLine();
		}
		
		System.out.println("Programa encerrado.");
		
	}
}
