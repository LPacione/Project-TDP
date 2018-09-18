package Logica.Armamento;

import Logica.Disparo.Disparo;

public class MisilDoble extends Arma{
		

public MisilDoble() {
	super();
	disparo.multiplicarDaño(2);
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
