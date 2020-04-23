package stock;

public class Producto {

	private int idProducto;
	private String descripcion;
	private double precioUnitario;
	private static int contador;
	
	private Producto() {
		
		this.idProducto=++contador;
	}

	public Producto (String descripcion, double precioUnitario) {
		this();
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "\n Producto: idProducto=" + idProducto + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario;
	}
	
	
	
	
}
