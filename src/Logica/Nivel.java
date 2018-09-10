package Logica;

import java.util.*;
import Logica.Enemigos.Enemigo;

public class Nivel {
	private LinkedList<Entidad> entidades;
	private LinkedList<Enemigo> enemigosVivos;
	private Nave nave;
	private int nroNivel;
	private Mapa mapa;
	
public Nivel(int i) {
	nroNivel=i;
	nave=new Nave();
	entidades= new LinkedList<Entidad>();
	enemigosVivos=new LinkedList<Enemigo>();
	mapa=new Mapa(this);
}
public void controlEnemigosVivos() {
	if(enemigosVivos.isEmpty())
		cambiarNivel();
}
public void cambiarNivel() {
	nroNivel++;
	entidades= new LinkedList<Entidad>();
	enemigosVivos=new LinkedList<Enemigo>();
	mapa.cargarNivel(this);
}
}
