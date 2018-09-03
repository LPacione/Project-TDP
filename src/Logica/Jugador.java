package Logica;

public class Jugador {
	private Nave Nave;
	private int Vida;
	private int Puntos;
	
public Jugador() {
	Nave=new Nave();
	Vida=100;
	Puntos=0;
}
public int getPuntos() {
	return Puntos;
}
public void setPuntos(int p) {
	Puntos=p;
}
public int getVida() {
	return Vida;
}
public void setVida(int v) {
	Vida=v;
}
public Nave getNave() {
	return Nave;
}
public void setNave(Nave n) {
	Nave=n;
}
}
