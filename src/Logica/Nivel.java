package Logica;

import java.util.*;

public class Nivel {
	private LinkedList<Enemigo> Enemigos;
	private Nave Nave;
	private Obstaculo Obstaculo;
	private int NroNivel;
	
public Nivel(int i) {
	NroNivel=i;
//	Obstaculo=new Obstaculo();
	Nave=new Nave();
	Enemigos= new LinkedList<Enemigo>();
}
}
