package Logica;

public class Mapa {
	private Nivel nivel;

public Mapa(Nivel n) {
	nivel=n;
}
public void cargarNivel(Nivel n) {
	nivel=n;
}
public Nivel obtenerNivel() {
	return nivel;
}
}
