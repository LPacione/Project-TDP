package Logica;

public class Armado implements Enemigo{
	private int Vida;
	private Arma Arma;
	private int Velocidad;
	
public Armado(Arma a) {
	Vida=100;
	Arma=a;
	Velocidad=10;
}
public int getVida() {
	return Vida;
}
public void setVida(int v) {
	Vida=v;
}
public int getVelocidad() {
	return Velocidad;
}
public void setVelocidad(int v) {
	Velocidad=v;
}
public void perderArma() {
	Arma=null;
	
}
}
