package supermercado;

public class Producto {

	private int idProducto;
	private String producto;
	private float precio;
	private static int contador;

	private Producto() {

		this.idProducto = ++contador;

	}

	public Producto(String producto, float precio) {
		this();
		this.producto = producto;
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return " \n Producto: idProducto=" + idProducto + ", producto=" + producto + ", precio=" + precio;
	}

}
