package Logica;

public class Arma {
	private Disparo Disparo;
	private String Tipo;

public Arma(String t,Disparo d) {
	Disparo=d;
	Tipo=t;
}
public void setDisparo(Disparo d) {
	Disparo=d;
}
public Disparo getDisparo() {
	return Disparo;
}
public void setTipo(String t) {
	Tipo=t;
}
public String setTipo() {
	return Tipo;
}
}
