package Logica.Disparo;

import Logica.Entidad;

public abstract class Disparo extends Entidad{
	private int Da�o;	
	private int Alcance;
	
public int getDa�o() {
	return Da�o;
}
public void setDa�o(int d) {
	Da�o=d;
}
public int getAlcance() {
	return Alcance;
}
public void setAlcance(int a) {
	Alcance=a;
}
}
