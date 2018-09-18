package Logica.Disparo;

import Logica.Entidad;

public class Disparo extends Entidad{
	private int daño;	
	private int alcance;
	
	
public Disparo(int d,int a) {
	super(0,0,0); //Como saber desde que entidad sale el disparo?
	daño=d;
	alcance=a;
}
public int getDaño() {
	return daño;
}
public void setDaño(int d) {
	daño=d;
}
public void multiplicarDaño(int i) {
	daño=daño*i;
}
public int getAlcance() {
	return alcance;
}
public void setAlcance(int a) {
	alcance=a;
}
}
