package Logica.Enemigos;

import Logica.Armamento.Arma;

public class Armado extends Enemigo{
	private Arma arma;
	private int velocidad;
	
public Armado(Arma a) {
	arma=a;
	velocidad=10;
}
public int getVelocidad() {
	return velocidad;
}
public void setVelocidad(int v) {
	velocidad=v;
}
public void perderArma() {
	arma=null;
	
}
}
