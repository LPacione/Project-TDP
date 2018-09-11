package Logica.Armamento;

import Logica.Disparo.Disparo;

public abstract class Arma {
	protected Disparo disparo;


protected Arma() {
	disparo=new Disparo(25,600);
}
public void setDisparo(Disparo d) {
	disparo=d;
}
public Disparo getDisparo() {
	return disparo;
}
public abstract void disparar();

}
