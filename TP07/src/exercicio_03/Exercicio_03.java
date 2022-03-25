package exercicio_03;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;

public class Exercicio_03 {
	
	
	
	public static void main(String[] argcs) {
		Random aleatorio = new Random();
		int maior=0;
		int menor=0;
		ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
		
		for(int i=0;i<50;i++) {
			int number = aleatorio.nextInt(99);
			listaDeNumeros.add(number);
		}
		for(int i = 0; i<listaDeNumeros.size();i++) {
			System.out.println(listaDeNumeros.get(i));
		}
		System.out.println("O maior numero da lista: " + Collections.max(listaDeNumeros));
		System.out.println("O menor numero da lista: " + Collections.min(listaDeNumeros));
		
		menor=Collections.min(listaDeNumeros);
		Collections.frequency(listaDeNumeros, menor);
		Collections.sort(listaDeNumeros);
		System.out.println("O menor numero da lista ocorre " + Collections.frequency(listaDeNumeros, menor) + " vezes na lista.");
		System.out.println("Nova ordem(crescente):");
		for(int i = 0; i<listaDeNumeros.size();i++) {
			System.out.println(listaDeNumeros.get(i));
		}
		
	}
	
}
