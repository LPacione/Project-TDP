package Logica.Enemigos;

import Logica.Entidad;

public abstract class Enemigo extends Entidad{

	

protected Enemigo(int v, int x, int y) {
		super(v, x, y);
}
public int getVelocidad() {
	return velocidad;
}
public void setVelocidad(int v) {
	velocidad=v;
}
}
