package caja;

public class Caja {

	private int ancho;
	private int alto;
	private int profundidad;
	
	public Caja() {
		 System.out.println("Constructor vacio");
	}

	public Caja(int ancho, int alto, int profundidad) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
	}

public int volumen() {
	
	int vol=alto*ancho*profundidad;
	
return vol;	
}
	
	
}
