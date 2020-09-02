package ep1;

public class ValorDiaria extends CalculoValor {

	private final double DIA = 86400000;

	public ValorDiaria(double valorDiaria) {
		this.valorParaCalculo = valorDiaria;
	}

	@Override
	public double valorConta(double tempo, Veiculo veiculo) {
		return valorParaCalculo * Math.ceil(tempo / DIA);
	}
}