package GUI;

import Logica.Logica;

public class ContadorTiempo extends Thread {

	private Logica laLogica;

	ContadorTiempo(Logica l) {
		this.laLogica = l;
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//	laLogica.mover();
		}
	}
}