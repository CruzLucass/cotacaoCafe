package cotacaoCafe.strategy;

public class Tipo2 implements Calculo{
	
	@Override
	public double calculo(double correlacaoDolar, double pesoSaca, double valorAtual) {
		
		return (pesoSaca * correlacaoDolar) + valorAtual + correlacaoDolar;
	}
	
}
