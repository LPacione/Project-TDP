package Logica;

public class Mapa {
	private Nivel Nivel;

public Mapa(Nivel n) {
	Nivel=n;
}
public void cargarNivel(Nivel n) {
	Nivel=n;
}
public Nivel obtenerNivel() {
	return Nivel;
}
}
