package Logica.Armamento;

import Logica.Disparo.Disparo;

public class Misil extends Arma{

public Misil() {
	super();
}

public Disparo getDisparo() {
	return null;
}
public int getDa�o() {
	return super.getDisparo().getDa�o();
}
public int getAlcance() {
	return super.getDisparo().getAlcance();
}
public void disparar() {
	
}
}
