package cotacaoCafe.context;

import cotacaoCafe.observer.Observer;
import cotacaoCafe.strategy.Calculo;

public class Conilon extends Cafe implements Observer{
	
	private double valorAtualConilon;
	
	calculo = (Calculo) new Tipo2();

	public double getValorAtualConilon() {
		return valorAtualConilon;
	}

	public void setValorAtualConilon(double valorAtualConilon) {
		this.valorAtualConilon = valorAtualConilon;
	}

	@Override
	public void update(double correlacaoDolar) {
		valorAtualConilon = ;
		
	}

}
