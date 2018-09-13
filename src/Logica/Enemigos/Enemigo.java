package Logica.Enemigos;

import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;

import Logica.Entidad;

public class Enemigo extends Entidad{
	

public Enemigo(int v, int x, int y) {
		super(v, x, y);
		System.out.println("Cree el super de enemigo");
		this.image[0] = new ImageIcon("up2.png");
		this.image[1] = new ImageIcon("down2.png");
		this.image[2] = new ImageIcon("left2.png");
		this.image[3] = new ImageIcon("right2.png");
		System.out.println("Cree las imagenes y sali de enemigo");
}
public int getVelocidad() {
	return velocidad;
}
public void setVelocidad(int v) {
	velocidad=v;
}
}
