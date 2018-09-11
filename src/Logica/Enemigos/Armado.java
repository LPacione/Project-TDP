package Logica.Enemigos;

import Logica.Armamento.Arma;

public class Armado extends Enemigo{
	private Arma arma;
	
	
public Armado(Arma a,int v,int x,int y) {
	super(v,x,y);
	arma=a;	
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
