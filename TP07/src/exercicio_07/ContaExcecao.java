package exercicio_07;

public class ContaExcecao extends Exception{
	
	private double saldo;
	public ContaExcecao(String message, double saldo) {
		super(message);
		this.saldo =saldo;
		
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

}
