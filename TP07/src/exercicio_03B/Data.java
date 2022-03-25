package exercicio_03B;

import java.util.Comparator;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Data implements Comparator<Funcionarios> {

	@Override
	public int compare(Funcionarios o1, Funcionarios o2) {
		if(o1.getData().before(o2.getData())) {
			return -1;
		}else if(o1.getData().after(o2.getData())) {
			return 1;
		}else {
			return 0;
		}
	}
}
