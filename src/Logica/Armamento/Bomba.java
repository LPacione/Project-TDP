package Logica.Armamento;

import Logica.Disparo.Disparo;

public class Bomba extends Arma{


public Bomba() {
	super();
	disparo.multiplicarDaño(4);
}
public void setDisparo(Disparo d) {
	disparo=d;
}
public Disparo getDisparo() {
	return disparo;
}
public void disparar() {
	
}
}
