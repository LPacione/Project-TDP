package Logica;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Jugador extends Entidad{
/*	private Nave nave;
	private int vida;
	private int puntos; */
	
public Jugador(int v, int x, int y){
	super(v, x, y);
	
/*	nave=new Nave();
	vida=100;
	puntos=0;
*/	
	
	image[0] = new ImageIcon("/Animacion/up.png");
	image[1] = new ImageIcon("/Animacion/down.png");
	image[2] = new ImageIcon("/Animacion/left.png");
	image[3] = new ImageIcon("/Animacion/right.png");
	
	
	System.out.println("Entre a jugador y cree animaciones");

}
/*
public int getPuntos() {
	return puntos;
}
public void setPuntos(int p) {
	puntos=p;
}
public int getVida() {
	return vida;
}
public void setVida(int v) {
	vida=v;
}
public Nave getNave() {
	return nave;
}
public void setNave(Nave n) {
	nave=n;
}
public void afectarVidaJugador(int i) {
	vida=-i;
}
public void afectarPuntosJugador(int p) {
	puntos+=p;
}*/
}
