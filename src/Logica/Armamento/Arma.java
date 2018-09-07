package Logica.Armamento;

import Logica.Disparo.Disparo;

public abstract class Arma {
	private Disparo Disparo;


public void setDisparo(Disparo d) {
	Disparo=d;
}
public Disparo getDisparo() {
	return Disparo;
}
public abstract void disparar();
}
