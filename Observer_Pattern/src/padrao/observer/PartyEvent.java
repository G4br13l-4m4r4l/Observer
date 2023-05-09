package padrao.observer;

public class PartyEvent {
	public static void main(String[] args) {
		InteressadoObs ansioso = new InteressadoObs();
		ListenerSubject sub = new ListenerSubject();
		
		sub.registrarOBS(ansioso);
		sub.monitorar();
	}
}
