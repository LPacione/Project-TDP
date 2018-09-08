package Logica.Armamento;

import Logica.Disparo.Disparo;

public abstract class Arma {
	private Disparo disparo;


public void setDisparo(Disparo d) {
	disparo=d;
}
public Disparo getDisparo() {
	return disparo;
}
public abstract void disparar();
}
