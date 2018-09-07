package Logica.Armamento;

import Logica.Disparo.Disparo;

public class Misil extends Arma{
	private Disparo Disparo;

public Misil(Disparo d) {
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
