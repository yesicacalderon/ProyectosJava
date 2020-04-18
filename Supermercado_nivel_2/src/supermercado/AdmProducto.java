package supermercado;

import java.util.List;

public class AdmProducto {

	List<Producto> lstProducto;

	public AdmProducto(List<Producto> lstProducto) {
		super();
		this.lstProducto = lstProducto;
	}

	public List<Producto> getLstProducto() {
		return lstProducto;
	}

	public void setLstProducto(List<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}

	@Override
	public String toString() {
		return " Lista de Productos=" + lstProducto;
	}

	public boolean agregarProducto(String producto, float precio) {

		boolean agregado = false;

		lstProducto.add(new Producto(producto, precio));
		agregado = true;

		return agregado;
	}

	public Producto traerProducto(int idProducto) {
		Producto traer = null;
		int index = 0;

		while (index < lstProducto.size()) {

			if (lstProducto.get(index).getIdProducto() == idProducto) {

				traer = lstProducto.get(index);
			}

			index++;
		}

		return traer;
	}

	public boolean eliminarProducto(int idProducto) {

		boolean eliminado = false;
		int index = 0;

		while (index < lstProducto.size()) {

			if (lstProducto.get(index).getIdProducto() == idProducto) {

				lstProducto.remove(index);
				eliminado = true;
			}
			index++;
		}

		return eliminado;
	}

}
