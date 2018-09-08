package Logica.Armamento;

import Logica.Disparo.Disparo;

public class MisilDoble extends Arma{
	private Disparo disparo;	

public MisilDoble(Disparo d) {
	disparo=d;
}
public void setDisparo(Disparo d) {
	disparo=d;
}
public Disparo getDisparo() {
	return disparo;
}
public void disparar() {
	
}
}
