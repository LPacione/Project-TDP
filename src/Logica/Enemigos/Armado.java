package Logica.Enemigos;

import Logica.Armamento.Arma;

public class Armado extends Enemigo{
	private Arma Arma;
	private int Velocidad;
	
public Armado(Arma a) {
	Arma=a;
	Velocidad=10;
}
public int getVelocidad() {
	return Velocidad;
}
public void setVelocidad(int v) {
	Velocidad=v;
}
public void perderArma() {
	Arma=null;
	
}
}
