package Logica;

import GUI.Interfaz;

public class Logica {
	private Jugador jugador;
	private Nivel lvl;
	private Mapa mapa;
	

public Logica(Interfaz interfaz) {
	setJugador(new Jugador());
	lvl = new Nivel(1);
	setMapa(new Mapa(lvl));
}


public Jugador getJugador() {
	return jugador;
}
public void setJugador(Jugador jugador) {
	this.jugador = jugador;
}
public Mapa getMapa() {
	return mapa;
}
public void setMapa(Mapa mapa) {
	this.mapa = mapa;
}

}
