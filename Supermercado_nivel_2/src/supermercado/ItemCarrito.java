package supermercado;

public class ItemCarrito {

	private int idItem;
	Producto producto;
	private int cantidad;
	private static int contador;

	private ItemCarrito() {

		this.idItem = ++contador;

	}

	public ItemCarrito(Producto producto, int cantidad) {
		this();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return " Item de carrito=" + idItem + ", producto=" + producto + ", cantidad= " + cantidad + "\n";
	}

}
