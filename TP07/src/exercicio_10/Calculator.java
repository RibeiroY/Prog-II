package exercicio_10;



public class Calculator {

	public double div(double num1, double num2) throws InvalidOperationException {
		
		if(num2==0) {
			InvalidOperationException exception = new InvalidOperationException ("Erro: Não existe divisão por 0.");
			throw exception;
		}
		return num1/num2;
	}
	
	public double log10(double num1) throws InvalidOperationException{
		
		if(num1<=0) {
			InvalidOperationException exception = new InvalidOperationException ("Erro: O numero enviado não pode ser menor ou igual a zero");
			throw exception;
		}
		
		return Math.log(num1) / Math.log(10);
	}

}
