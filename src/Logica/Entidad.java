package Logica;

import Logica.Colisionadores.Colisionador;

public abstract class Entidad {
	private Colisionador colisionador;
	private int vida;
	
public void setVida(int v) {
	vida=v;
}
public int getVida() {
	return vida;
}
public void restarVida(int i) {
	vida--;
}
public Entidad chocar() {
	return this;	
}
public void serChocado(Entidad e) {
	
}
}
