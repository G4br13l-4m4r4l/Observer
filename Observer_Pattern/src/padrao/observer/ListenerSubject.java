package padrao.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ListenerSubject {
	private List<ChegadaObservador> obs = new ArrayList<>();
	
	public void registrarOBS(ChegadaObservador Obs) {
		this.obs.add(Obs);
	}
	
	public void monitorar () {
		Scanner input = new Scanner(System.in);
		String valor = "";
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("the event will happend?");
			valor= input.nextLine();
			
			if("yes".equalsIgnoreCase(valor)) {
				EventoChegada evento = new EventoChegada(new Date());
				obs.stream().forEach(o->o.chegou(evento));	
			}else {
				System.out.println("Will go again!!");
			}
		}
		
		input.close();
	}
}
