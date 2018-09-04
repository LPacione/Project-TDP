package Logica;

public class Nave {
	private Escudo Escudo;
	private PowerUp PowerUp;
	private Arma Arma;

public Nave() {
	Arma=new Arma("Basica",new Disparo());
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
