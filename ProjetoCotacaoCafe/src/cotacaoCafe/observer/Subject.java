package cotacaoCafe.observer;

public interface Subject {
	public void registrarObservadores(Observer o);
	   public void removerObservadores(Observer o);
	   public void notificarObservadores();
}
