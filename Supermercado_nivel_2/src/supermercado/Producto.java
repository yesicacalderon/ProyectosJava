package supermercado;

public class Producto {

	private int idProducto;
	private String Producto;
	private float precio;
	private static int contadorP;

	private Producto() {

		this.idProducto = ++contadorP;

	}

	public Producto(String producto, float precio) {
		this();
		Producto = producto;
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProducto(String producto) {
		Producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return " idProducto=" + idProducto + ", Producto=" + Producto + ", precio=" + precio;
	}

}
