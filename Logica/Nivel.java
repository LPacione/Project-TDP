package Logica;

import java.util.*;
import Logica.Enemigos.Enemigo;

public class Nivel {
	private LinkedList<Entidad> entidades;
	private Enemigo [] enemigosVivos;
	private Nave nave;
	private int nroNivel;
	//private Mapa mapa;
	
public Nivel(int i) {
	setNroNivel(i);
	setNave(new Nave());
	setEntidades(new LinkedList<Entidad>());
	enemigosVivos=new Enemigo[3];
	//mapa=new Mapa(this);
}
/*public void controlEnemigosVivos() {
	if(enemigosVivos.isEmpty())
		cambiarNivel();
}
public void cambiarNivel() {
	setNroNivel(getNroNivel() + 1);
	setEntidades(new LinkedList<Entidad>());
	enemigosVivos=new LinkedList<Enemigo>();
	//mapa.cargarNivel(this);
}*/
public int getNroNivel() {
	return nroNivel;
}
public void setNroNivel(int nroNivel) {
	this.nroNivel = nroNivel;
}
public Nave getNave() {
	return nave;
}
public void setNave(Nave nave) {
	this.nave = nave;
}
public LinkedList<Entidad> getEntidades() {
	return entidades;
}
public void setEntidades(LinkedList<Entidad> entidades) {
	this.entidades = entidades;
}
public Enemigo[] getEnemigos(){
	return enemigosVivos;
}
}
