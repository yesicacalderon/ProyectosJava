package supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Carrito {

	private int idCarrito;
	LocalDate fecha;
	LocalTime hora;
	List<ItemCarrito> lstItem;
	Cliente cliente;
	private static int contador;

	private Carrito() {

		this.idCarrito = ++contador;

	}

	public Carrito(LocalDate fecha, LocalTime hora, List<ItemCarrito> lstItem, Cliente cliente) {
		this();
		this.fecha = fecha;
		this.hora = hora;
		this.lstItem = lstItem;
		this.cliente = cliente;
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemCarrito> getLstItem() {
		return lstItem;
	}

	public void setLstItem(List<ItemCarrito> lstItem) {
		this.lstItem = lstItem;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return " Carrito:\n idCarrito=" + idCarrito + ", fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente
				+ "\n Lista de Producto=" + lstItem;
	}

	public boolean agregarItem(Producto producto, int cantidad) {
		boolean agregado = false;

		lstItem.add(new ItemCarrito(producto, cantidad));
		agregado = true;

		return agregado;
	}

	public boolean eliminarItem(Producto producto, int cantidad) {

		boolean eliminado = false;
		int index = 0;
		int can = 0;
		while (index < lstItem.size()) {

			if (lstItem.get(index).getProducto().equals(producto)) {

				can = lstItem.get(index).getCantidad() - cantidad;
				lstItem.get(index).setCantidad(can);
				if (can == 0) {
					lstItem.remove(index).getCantidad();
					eliminado = true;
				}
			}

			index++;
		}

		return eliminado;
	}

	public float calcularTotal() {
		float total = 0;
		int index = 0;
		while (index < lstItem.size()) {

			total = total + (lstItem.get(index).getProducto().getPrecio() * lstItem.get(index).getCantidad());

			index++;
		}
		return total;
	}

}
