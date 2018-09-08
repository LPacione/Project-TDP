package Logica.Enemigos;

import Logica.Entidad;

public abstract class Enemigo extends Entidad{
	private int velocidad;
	
public void mover() {
}
public int getVelocidad() {
	return velocidad;
}
public void setVelocidad(int v) {
	velocidad=v;
}
}
