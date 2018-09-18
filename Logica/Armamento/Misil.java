package Logica.Armamento;

import Logica.Disparo.Disparo;

public class Misil extends Arma{

public Misil() {
	super();
}

public Disparo getDisparo() {
	return null;
}
public int getDaño() {
	return super.getDisparo().getDaño();
}
public int getAlcance() {
	return super.getDisparo().getAlcance();
}
public void disparar() {
	
}
}
