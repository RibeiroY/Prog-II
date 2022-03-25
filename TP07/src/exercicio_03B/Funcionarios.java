package exercicio_03B;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Funcionarios implements Comparable <Funcionarios> {
	
	private String nome;
	private double salario;
	private Date data;
	int ID;
	
	
	public Funcionarios(String nome, double salario, Date data, int ID) {
		this.nome = nome;
		this.salario = salario;
		this.data = data;
		this.ID = ID;
	}
	
	@Override
	public int compareTo(Funcionarios o) {
		if(this.getSalario() == o.getSalario()) {
			return 0;
		}else if(this.getSalario()<o.getSalario()) {
			return -1;
		}else {
			return 1;
		}
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "***********************" + "\nFuncionarios: " + nome + "\nSalario: " + salario + "\nData de contratação: " + data + "\nID: " + ID;
	}
	

}
