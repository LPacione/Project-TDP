package Logica.Disparo;

import Logica.Entidad;

public class Disparo extends Entidad{
	private int da�o;	
	private int alcance;
	
	
public Disparo(int d,int a) {
	super(0,0,0); //Como saber desde que entidad sale el disparo?
	da�o=d;
	alcance=a;
}
public int getDa�o() {
	return da�o;
}
public void setDa�o(int d) {
	da�o=d;
}
public void multiplicarDa�o(int i) {
	da�o=da�o*i;
}
public int getAlcance() {
	return alcance;
}
public void setAlcance(int a) {
	alcance=a;
}
}
