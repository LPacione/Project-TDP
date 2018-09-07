package Logica.Enemigos;

import Logica.Entidad;

public abstract class Enemigo extends Entidad{
	private int Velocidad;
	
public void mover() {
}
public int getVelocidad() {
	return Velocidad;
}
public void setVelocidad(int v) {
	Velocidad=v;
}
}
