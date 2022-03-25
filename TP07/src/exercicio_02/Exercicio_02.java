package exercicio_02;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Exercicio_02 {
	public static void main(String[] argcs) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> mapa = new HashMap<String, String>();
		String str,str2;
		String a;
		
		System.out.println("Digite o nome do funcionário e em seguida suas respectivas chaves.");
		for(int i=0;i<5;i++) {
			System.out.println("Nome:");
			str=sc.nextLine();
			System.out.println("Chave:");
			str2=sc.nextLine();
			str2=str2.toUpperCase();
			while(mapa.containsKey(str2)) {
				System.out.println("Chave já inserida. Digite novamente.");
				str2=sc.nextLine();
				str2=str2.toUpperCase();
			}
			mapa.put(str2, str);
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
