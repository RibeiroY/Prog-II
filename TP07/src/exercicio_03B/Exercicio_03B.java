package exercicio_03B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Exercicio_03B {
	
	public static void main(String[] argcs) {
		
		
		
		ArrayList<Funcionarios> listaDeFuncionarios = new ArrayList<Funcionarios>();
		
		Ordenar ordem=new Ordenar();
		Data data2 = new Data();
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Digite os dados do funcionário.");
		try {
			listaDeFuncionarios.add(new Funcionarios("Yuri", 5750.0, dataFormat.parse("15/05/2019"), 20022021));
			listaDeFuncionarios.add(new Funcionarios("Gabriel", 3750.0, dataFormat.parse("14/08/2019"), 20022020));
			listaDeFuncionarios.add(new Funcionarios("Alice", 7750.0, dataFormat.parse("14/08/2020"), 20012020));
			listaDeFuncionarios.add(new Funcionarios("Hannah", 2750.0, dataFormat.parse("07/02/2021"), 20052020));
			listaDeFuncionarios.add(new Funcionarios("Arthur", 3700.0, dataFormat.parse("07/03/2020"), 20052120));
		}catch(ParseException f) {
            f.printStackTrace();
        }
		
		
		System.out.println("Ordem crescente: Salário");
		Collections.sort(listaDeFuncionarios);
		System.out.print(listaDeFuncionarios);
		
		
		System.out.println("Ordem Alfabética");
		Collections.sort(listaDeFuncionarios,ordem);
		System.out.print(listaDeFuncionarios);
		
		
		
		
		
		System.out.println("Maior salário: " + Collections.max(listaDeFuncionarios));
		System.out.println("Menor salário: " + Collections.min(listaDeFuncionarios));
		
		Collections.max(listaDeFuncionarios,data2);
		Collections.min(listaDeFuncionarios,data2);
		System.out.println("Funcionario mais antigo: " + Collections.min(listaDeFuncionarios,data2));
		System.out.println("Funcionário mais novo: " + Collections.max(listaDeFuncionarios,data2));
		
		System.out.println("Programa encerrado.");
		
		
	}
		
		
		
	

}
