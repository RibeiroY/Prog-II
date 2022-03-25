package exercicio_03B;
import java.util.Comparator;
public class Ordenar implements Comparator<Funcionarios> {

	@Override
	public int compare(Funcionarios o1, Funcionarios o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
