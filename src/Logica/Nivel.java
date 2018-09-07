package Logica;

import java.util.*;

import Logica.Obstaculos.Obstaculo;

public class Nivel {
	private LinkedList<Entidad> Entidades;
	private Nave Nave;
	private Obstaculo Obstaculo;
	private int NroNivel;
	
public Nivel(int i) {
	NroNivel=i;
//	Obstaculo=new Obstaculo();
	Nave=new Nave();
	Entidades= new LinkedList<Entidad>();
}
}
