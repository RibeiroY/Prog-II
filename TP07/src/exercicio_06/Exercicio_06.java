package exercicio_06;

import java.util.Scanner;

public class Exercicio_06 {
	public static void main(String[] argcs) {
		Scanner sc = new Scanner(System.in);
		Conta account= new Conta();
		account.deposita(2500);
		System.out.println("Saldo: 2500.");
		double saque;
		
		System.out.println("Digite o valor a ser sacado.");
		saque = sc.nextDouble();
		try{account.saca(saque);
		}catch(ContaExcecao f){
			System.out.println(f.getMessage());
		}
		
		
		
	}
}
