package cotacaoCafe.strategy;

public class Tipo1 implements Calculo{
			
	@Override
	public double calculo(double correlacaoDolar, double pesoSaca, double valorAtual) {
		
		return (pesoSaca * correlacaoDolar) + valorAtual;
	}	
	
}
