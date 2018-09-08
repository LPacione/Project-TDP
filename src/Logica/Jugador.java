package Logica;

public class Jugador {
	private Nave nave;
	private int vida;
	private int puntos;
	
public Jugador() {
	nave=new Nave();
	vida=100;
	puntos=0;
}
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
}
}
