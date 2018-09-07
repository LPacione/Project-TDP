package Logica;

import Logica.Armamento.Arma;
import Logica.Armamento.Escudo;
import Logica.Premios.PowerUp;

public class Nave extends Entidad{
	private Escudo Escudo;
	private PowerUp PowerUp;
	private Arma Arma;

public Nave() {
	//Inicializar arma
	Escudo=null;
	PowerUp=null;
}
public void setArma(Arma a) {
	Arma=a;
}
public Arma getArma() {
	return Arma;
}
public void setEscudo(Escudo e) {
	Escudo=e;
}
public Escudo getEscudo() {
	return Escudo;
}
public void setPowerUp(PowerUp p) {
	PowerUp=p;
}
public PowerUp getPowerUp() {
	return PowerUp;
}
}
