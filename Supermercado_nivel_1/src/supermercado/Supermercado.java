package supermercado;

import java.util.List;

public class Supermercado {

	List<Producto> gondola;

	public Supermercado(List<Producto> gondola) {
		super();
		this.gondola = gondola;
	}

	public List<Producto> getGondola() {
		return gondola;
	}

	public void setGondola(List<Producto> gondola) {
		this.gondola = gondola;
	}

	@Override
	public String toString() {
		return " \n Supermercado: gondola=" + gondola;
	}

	public Producto traerProducto(int idProducto) {

		Producto traer = null;
		int index = 0;

		while (index < gondola.size()) {

			if (gondola.get(index).getIdProducto() == idProducto) {

				traer = gondola.get(index);

			}
			index++;
		}

		return traer;
	}

	public boolean agregarProducto(String producto, float precio) throws Exception {

		boolean confirmado = false;
		int index = 0;

		while (index < gondola.size()) {

			if (gondola.get(index).getProducto().equalsIgnoreCase(producto))
				throw new Exception("Producto ya existente");

			index++;
		}
		gondola.add(new Producto(producto, precio));
		confirmado = true;
		return confirmado;
	}

	public boolean modificarProducto(int idProducto, String producto, float precio) throws Exception {

		boolean modificado = false;

		if (traerProducto(idProducto) == null)
			throw new Exception("Producto no encontrado a modificar");
		int index = 0;
		while (index < gondola.size()) {

			if (gondola.get(index).getIdProducto() == idProducto) {

				gondola.get(index).setProducto(producto);
				gondola.get(index).setPrecio(precio);

			}
			index++;
		}
		return modificado;
	}

	public boolean eliminarProducto(int idProducto) throws Exception {
		boolean eliminado = false;

		if (traerProducto(idProducto) == null)
			throw new Exception("Producto no encontrado para eliminar");
		int index = 0;

		while (index < gondola.size()) {

			if (gondola.get(index).getIdProducto() == idProducto) {

				gondola.remove(index);

			}

			index++;
		}

		return eliminado;
	}

}
