package Logica.Armamento;

import Logica.Disparo.Disparo;

public class Bomba extends Arma{
	private Disparo Disparo;

public Bomba(Disparo d) {
	Disparo=d;
}
public void setDisparo(Disparo d) {
	Disparo=d;
}
public Disparo getDisparo() {
	return Disparo;
}
public void disparar() {
	
}
}
