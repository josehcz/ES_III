package ep1;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		Date data = new Date();
		Veiculo v = new Passeio(data.getTime());

		ContaEstacionamento c = new ContaEstacionamento();
		c.veiculo = v;

		CalculoValor cv = null;

		if (v.tempo < (15 * 3600000)) {
			cv = new ValorDiaria(c.veiculo.valor);

		}

		c.setCalculo(cv);
		
		
	}

}