package Logica;

import Logica.Colisionadores.Colisionador;

public abstract class Entidad {
	private Colisionador Colisionador;
	private int Vida;
	
public void setVida(int v) {
	Vida=v;
}
public int getVida() {
	return Vida;
}
public void restarVida(int i) {
	Vida--;
}
public Entidad chocar() {
	return this;	
}
public void serChocado(Entidad e) {
	
}
}
