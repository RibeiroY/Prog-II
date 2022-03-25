package exercicio_06;

public class Conta {
	private double saldo;
	private double limite;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void saca(double saque) throws ContaExcecao {
		
		if(saldo<saque) {
			ContaExcecao excecao = new ContaExcecao("Saldo insuficiente");
			throw excecao;
		}
		this.saldo=saldo-saque;
		
		
	}
	public void deposita(double deposito) {
		this.saldo=saldo+deposito;
	}
		

}
