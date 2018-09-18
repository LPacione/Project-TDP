package Logica;

import Logica.Armamento.Arma;
import Logica.Armamento.Escudo;
import Logica.Premios.PowerUp;

public class Nave extends Entidad{
	private Escudo escudo;
	private PowerUp powerUp;
	private Arma arma;

public Nave() {
	super(5,400,600);
	//arma=new Arma();
	escudo=null;
	powerUp=null;
}
public void setArma(Arma a) {
	arma=a;
}
public Arma getArma() {
	return arma;
}
public void setEscudo(Escudo e) {
	escudo=e;
}
public Escudo getEscudo() {
	return escudo;
}
public void setPowerUp(PowerUp p) {
	powerUp=p;
}
public PowerUp getPowerUp() {
	return powerUp;
}
}
