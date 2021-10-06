package cotacaoCafe.context;

import cotacaoCafe.observer.Observer;
import cotacaoCafe.observer.Subject;
import cotacaoCafe.strategy.Calculo;
import cotacaoCafe.strategy.Tipo2;

public class Conilon extends Cafe implements Observer{
	
	private double valorAtualConilon = 500;
	private double valorAtualizado;
	
	public Calculo calculo = new Tipo2();
	
	public Conilon(Subject api) {
		api.registrarObservadores(this);
	}

	public double getValorAtualConilon() {
		return valorAtualConilon;
	}
	
	public void exibir(){
		System.out.println("  \n");
		System.out.println("  Atualizando valor do café conilon...");
		System.out.println("  Valor Atual: " + getValorAtual());
		System.out.println("  Usando calculo do Tipo 2");
		System.out.println("  Valor Reajustado: " + getValorAtualizado());
		System.out.println(" -------------------------------------------- ");
	}

	
	@Override
	public void update(double correlacaoDolar) {
		
		this.valorAtualizado = calculo.calculo(correlacaoDolar, 60, valorAtualConilon);
		exibir();
		this.valorAtualConilon = this.valorAtualizado;
	}


	@Override
	public double getValorAtualizado() {
		return this.valorAtualizado;
	}


	@Override
	public double getValorAtual() {
		return this.valorAtualConilon;
	}

}
