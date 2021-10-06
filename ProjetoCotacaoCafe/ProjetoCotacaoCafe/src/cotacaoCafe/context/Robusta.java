package cotacaoCafe.context;

import cotacaoCafe.observer.Observer;
import cotacaoCafe.observer.Subject;
import cotacaoCafe.strategy.Calculo;
import cotacaoCafe.strategy.Tipo2;

public class Robusta extends Cafe implements Observer{
	
	private double valorAtualRobusta = 475;
	private double valorAtualizado;
	
	public Calculo calculo = new Tipo2();
	
	public Robusta(Subject api) {
		api.registrarObservadores(this);
	}

	public double getValorAtualRobusta() {
		return valorAtualRobusta;
	}

	public void setValorAtualRobusta(double valorAtualRobusta) {
		this.valorAtualRobusta = valorAtualRobusta;
	}
	
	public void exibir() {
		System.out.println("  \n");
		System.out.println("  Atualizando valor do café robusta...");
		System.out.println("  Valor Atual: " + getValorAtual());
		System.out.println("  Usando calculo do Tipo 2");
		System.out.println("  Valor Reajustado: " + getValorAtualizado());
	}

	@Override
	public void update(double correlacaoDolar) {
		
		this.valorAtualizado = calculo.calculo(correlacaoDolar, 65, valorAtualRobusta);
		exibir();
		this.valorAtualRobusta = this.valorAtualizado;
	}

	@Override
	public double getValorAtualizado() {
		return this.valorAtualizado;
	}

	@Override
	public double getValorAtual() {
		return this.valorAtualRobusta;
	}
}
