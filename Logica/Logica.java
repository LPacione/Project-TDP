package Logica;

import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;

import GUI.Interfaz;
import Logica.Enemigos.Enemigo;



public class Logica {
	private Jugador jugador;
	private Nivel lvl;
	private Enemigo [] enemigos;
	private Mapa mapa;
	

public Logica(Interfaz interfaz) {
	System.out.println("Entre a Logica");
	jugador= new Jugador(15,10,10);
	enemigos= new Enemigo[3];
	lvl = new Nivel(1);
	interfaz.add(jugador.getGrafico());
	setMapa(new Mapa(lvl));
	
	for(int i = 0; i < enemigos.length; i++){
		Random r = new Random();
		enemigos[i] = new Enemigo(10, r.nextInt(interfaz.getWidth() - 32), r.nextInt(interfaz.getHeight() - 32));
		interfaz.add(enemigos[i].getGrafico());
		System.out.println("Agregue "+enemigos[i].getGrafico().getLocation());
	}
	System.out.println("Sali de Logica");
}


public Jugador getJugador() {
	return jugador;
}
public void setJugador(Jugador jugador) {
	this.jugador = jugador;
}

public Mapa getMapa() {
	return mapa;
}
public void setMapa(Mapa mapa) {
	this.mapa = mapa;
}

public void mover(){
	Enemigo [] e= lvl.getEnemigos();
	for(int i = 0; i < lvl.getEnemigos().length; i++){
		
		// Inteligencia de los malos
		Random r = new Random();
		
		int dir = r.nextInt(4);
		
		e[i].mover(dir);
	}
}

public void mover(int dir){		
	int direccion = 0;
	
	switch (dir){
		case KeyEvent.VK_UP : //Arriba
			direccion = 0;
			break;
		case KeyEvent.VK_DOWN : //Abajo
			direccion = 1;
			break;
		case KeyEvent.VK_LEFT : //Izquierda
			direccion = 2;
			break;
		case KeyEvent.VK_RIGHT : //Derecha
			direccion = 3;
			break;
	}
	
	jugador.mover(direccion);
}

}
