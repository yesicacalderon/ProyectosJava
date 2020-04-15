package incaaProyecto;

public class Pelicula {

	private int idPelicula;
	private String Pelicula;
	public Pelicula(int idPelicula, String pelicula) {
		super();
		this.idPelicula = idPelicula;
		Pelicula = pelicula;
	}
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getPelicula() {
		return Pelicula;
	}
	public void setPelicula(String pelicula) {
		Pelicula = pelicula;
	}
	@Override
	public String toString() {
		return "\n Pelicula idPelicula=" + idPelicula + ", Pelicula=" + Pelicula;
	}
	
}
