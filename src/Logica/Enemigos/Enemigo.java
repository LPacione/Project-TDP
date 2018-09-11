package Logica.Enemigos;

import java.awt.event.KeyEvent;
import java.util.Random;

import Logica.Entidad;

public abstract class Enemigo extends Entidad{

	protected int velocidad;

	

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
