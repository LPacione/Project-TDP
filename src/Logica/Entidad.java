package Logica;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

import Logica.Colisionadores.Colisionador;

public abstract class Entidad {
	private Colisionador colisionador;
	private int vida;
	protected JLabel grafico;
	protected Icon image[];
	protected final int width = 32;
	protected final int height = 32;
	protected int velocidad;
	protected Point pos;
	
protected Entidad(int v, int x, int y) {
	velocidad=v;
	this.pos=new Point(x,y);
}
	
public void setVida(int v) {
	vida=v;
}
public int getVida() {
	return vida;
}
public void restarVida(int i) {
	vida--;
}
public Entidad chocar() {
	return this;	
}
protected void cambiarGrafico(int dir){
	if(this.grafico != null){
		this.grafico.setIcon(this.image[dir]);
		this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
	}
}

public void mover(int dir){	
	switch (dir) {
		case 0 : //Arriba
			pos.setLocation(pos.x, pos.y - velocidad);
			break;
		case 1 : //Abajo
			pos.setLocation(pos.x, pos.y + velocidad);
			break;
		case 2 : //Izquierda
			pos.setLocation(pos.x - velocidad, pos.y);
			break;
		case 3 : //Derecha
			pos.setLocation(pos.x + velocidad, pos.y);
			break;
	}
	cambiarGrafico(dir);
}

public JLabel getGrafico(){
	if(this.grafico == null){
		this.grafico = new JLabel(image[0]);
		this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
	}
	
	return this.grafico;
}
}
