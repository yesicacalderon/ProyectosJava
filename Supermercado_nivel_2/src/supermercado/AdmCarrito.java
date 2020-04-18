package supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AdmCarrito {

	List<Carrito>lstCarrito;

	public AdmCarrito(List<Carrito> lstCarrito) {
		super();
		this.lstCarrito = lstCarrito;
	}

	public List<Carrito> getLstCarrito() {
		return lstCarrito;
	}

	public void setLstCarrito(List<Carrito> lstCarrito) {
		this.lstCarrito = lstCarrito;
	}

	@Override
	public String toString() {
		return "AdmCarrito [lstCarrito=" + lstCarrito + "]";
	}
	


}
