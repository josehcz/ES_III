package ep1;

public class ContaEstacionamento {

	private CalculoValor calculo;
	public Veiculo veiculo;
	private double inicio, fim;

	public double valorConta() {
		return calculo.valorConta(fim - inicio, veiculo);
	}

	// valorDiaria, valorMensal, valor....
	// promocao
	public void setCalculo(CalculoValor calculo) {
		this.calculo = calculo;
	}
}