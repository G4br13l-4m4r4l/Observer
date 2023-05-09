package padrao.observer;

public class InteressadoObs implements ChegadaObservador{
	public void chegou(EventoChegada evento) {
		System.out.println("getting data");
		System.out.println("Loading...");
		System.out.println("start!!");
	}
}
