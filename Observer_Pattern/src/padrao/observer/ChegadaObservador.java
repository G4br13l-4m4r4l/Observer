package padrao.observer;

@FunctionalInterface
public interface ChegadaObservador {
	
	public void chegou(EventoChegada evento);
}
