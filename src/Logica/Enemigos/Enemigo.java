package Logica.Enemigos;

import java.awt.event.KeyEvent;
import java.util.Random;

import Logica.Entidad;

public abstract class Enemigo extends Entidad{
	private int velocidad;


	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int v) {
		velocidad=v;
	}

}
