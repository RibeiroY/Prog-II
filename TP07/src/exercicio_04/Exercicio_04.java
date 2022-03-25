package exercicio_04;

import java.text.ParseException;

import exercicio_03B.Funcionarios;

public class Exercicio_04 {
	public static void main(String[] argcs) {
		System.out.println("Início do main");
		metodo1();
		System.out.println("Fim do main");
	}
	static void metodo1() {
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}
	static void metodo2() {
		System.out.println("Início do método 2");
		
		try {
			int [] array = new int[10];
			for(int i=0;i<=15;i++) {
				array[i]=i;
				System.out.println(i);
			}
			
		}catch(Exception f) {
            System.out.println("Ocorreu um erro inesperado.");
        }
		
		
	}
	

}
