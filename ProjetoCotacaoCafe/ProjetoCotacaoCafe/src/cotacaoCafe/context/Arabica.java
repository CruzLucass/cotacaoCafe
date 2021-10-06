package cotacaoCafe.context;

import cotacaoCafe.observer.Observer;
import cotacaoCafe.observer.Subject;
import cotacaoCafe.strategy.Calculo;
import cotacaoCafe.strategy.Tipo1;

public class Arabica extends Cafe implements Observer{
	
	private double valorAtualArabica = 450;
	private double valorAtualizado;
	
	public Calculo calculo = new Tipo1();
	
	public Arabica(Subject api) {
		api.registrarObservadores(this);
	}

	public double getValorAtualArabica() {
		return valorAtualArabica;
	}

	public void setValorAtualArabica(double valorAtualArabica) {
		this.valorAtualArabica = valorAtualArabica;
	}
	
	public void exibir() {
		System.out.println("  ");
		System.out.println("  Atualizando valor do café arábica...");
		System.out.println("  Valor Atual: " + getValorAtual());
		System.out.println("  Usando calculo do Tipo 1");
		System.out.println("  Valor Reajustado: " + getValorAtualizado());
	}

	@Override
	public void update(double correlacaoDolar) {
		
		this.valorAtualizado = calculo.calculo(correlacaoDolar, 60, valorAtualArabica);
		exibir();
		this.valorAtualArabica = this.valorAtualizado;
	}

	@Override
	public double getValorAtualizado() {
		return this.valorAtualizado;
	}

	@Override
	public double getValorAtual() {
		return this.valorAtualArabica;
	}
}
