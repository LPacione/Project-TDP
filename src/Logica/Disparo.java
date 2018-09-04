package Logica;

public class Disparo {
	private int Daño;	
	private int Alcance;
	
public Disparo() {
	Daño=10;
	Alcance=2;
}
public Disparo(int d, int a) {
	Daño=d;
	Alcance=a;
}
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
