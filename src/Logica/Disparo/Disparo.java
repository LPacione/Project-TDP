package Logica.Disparo;

import Logica.Entidad;

public abstract class Disparo extends Entidad{
	private int da�o;	
	private int alcance;
	
public int getDa�o() {
	return da�o;
}
public void setDa�o(int d) {
	da�o=d;
}
public int getAlcance() {
	return alcance;
}
public void setAlcance(int a) {
	alcance=a;
}
}
