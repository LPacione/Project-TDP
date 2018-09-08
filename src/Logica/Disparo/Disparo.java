package Logica.Disparo;

import Logica.Entidad;

public abstract class Disparo extends Entidad{
	private int daño;	
	private int alcance;
	
public int getDaño() {
	return daño;
}
public void setDaño(int d) {
	daño=d;
}
public int getAlcance() {
	return alcance;
}
public void setAlcance(int a) {
	alcance=a;
}
}
