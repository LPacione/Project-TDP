package Logica;

public class Disparo {
	private int Da�o;	
	private int Alcance;
	
public Disparo() {
	Da�o=10;
	Alcance=2;
}
public Disparo(int d, int a) {
	Da�o=d;
	Alcance=a;
}
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
