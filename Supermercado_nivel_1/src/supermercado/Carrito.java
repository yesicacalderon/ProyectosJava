package supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public class Carrito {

	private int idCarrito;
	LocalDate fecha;
	LocalTime hora;
	List<ItemCarrito> lstItem;

	public Carrito(int idCarrito, LocalDate fecha, LocalTime hora, List<ItemCarrito> lstItem) {
		super();
		this.idCarrito = idCarrito;
		this.fecha = fecha;
		this.hora = hora;
		this.lstItem = lstItem;
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

	@Override
	public String toString() {
		return " \n Carrito: idCarrito=" + idCarrito + ", fecha=" + fecha + ", hora=" + hora + ", \n Lista=" + lstItem;
	}

	public boolean agregarItem(Producto producto, int cantidad) {
		boolean agregado = false;
		int index = 0;
		int contador = 0;

		// Optional<ItemCarrito>buscar=lstItem.stream().filter(p->p.getProducto().equals(producto)).findFirst();
		// if(buscar.isPresent()) {

		// ItemCarrito iCarrito=buscar.get();

		// iCarrito.setCantidad(iCarrito.getCantidad()+cantidad);

		// }
		while (index < lstItem.size()) {

			if (lstItem.get(index).getProducto().equals(producto)) {

				contador = lstItem.get(index).getCantidad() + cantidad;

				lstItem.get(index).setCantidad(contador);
				agregado = true;
			}

			index++;
		}

		if (agregado == false) {

			lstItem.add(new ItemCarrito(producto, cantidad));

		}

		return agregado;
	}

	public boolean eliminarItem(Producto producto, int cantidad) throws Exception {
		boolean eliminado = false;
		int index = 0;
		int c = 0;
		while (index < lstItem.size()) {

			if (lstItem.get(index).getProducto().equals(producto)) {

				c = lstItem.get(index).getCantidad() - cantidad;
				lstItem.get(index).setCantidad(c);
				eliminado = true;
				if (c == 0) {

					lstItem.remove(index);
				}
			}

			index++;
		}

		if (eliminado == false)
			throw new Exception("Producto no existente");

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
