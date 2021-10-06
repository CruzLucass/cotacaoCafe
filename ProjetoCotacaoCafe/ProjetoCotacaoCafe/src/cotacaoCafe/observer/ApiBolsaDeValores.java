package cotacaoCafe.observer;

import java.util.ArrayList;


public class ApiBolsaDeValores implements Subject {

	private ArrayList<Observer> observadores;
	private double correlacaoDolar;
	
	public ApiBolsaDeValores() {
		observadores = new ArrayList<Observer>();
	}
			
	public void registrarObservadores(Observer o) {
		observadores.add(o);		
	}

	public void removerObservadores(Observer o) {
		observadores.remove(o);		
	}

	public void notificarObservadores() {
		for(Observer o: observadores) {
			o.update(correlacaoDolar);
		}
	}
	
	public void setAtualizacaoBolsa (){
		notificarObservadores();
	}
	
	public void setMedicoes(double correlacaoDolar) {
		this.correlacaoDolar = correlacaoDolar;
		setAtualizacaoBolsa();
	}


}
