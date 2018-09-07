package Logica.Disparo;

import Logica.Entidad;

public abstract class Disparo extends Entidad{
	private int Daño;	
	private int Alcance;
	
public int getDaño() {
	return Daño;
}
public void setDaño(int d) {
	Daño=d;
}
public int getAlcance() {
	return Alcance;
}
public void setAlcance(int a) {
	Alcance=a;
}
}
