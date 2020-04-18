package supermercado;

public class Supermercado {

	AdmProducto admProducto;
	AdmCliente admCliente;
	AdmCarrito admCarrito;

	public Supermercado(AdmProducto admProducto, AdmCliente admCliente, AdmCarrito admCarrito) {
		super();
		this.admProducto = admProducto;
		this.admCliente = admCliente;
		this.admCarrito = admCarrito;
	}

	public AdmProducto getAdmProducto() {
		return admProducto;
	}

	public void setAdmProducto(AdmProducto admProducto) {
		this.admProducto = admProducto;
	}

	public AdmCliente getAdmCliente() {
		return admCliente;
	}

	public void setAdmCliente(AdmCliente admCliente) {
		this.admCliente = admCliente;
	}

	public AdmCarrito getAdmCarrito() {
		return admCarrito;
	}

	public void setAdmCarrito(AdmCarrito admCarrito) {
		this.admCarrito = admCarrito;
	}
	
	@Override
	public String toString() {
		return " Supermercado [admProducto=" + admProducto + " admCliente=" + admCliente + " admCarrito=" + admCarrito;
	}

	public boolean eliminarCliente(int idCliente) throws Exception {
		boolean eliminado=false;
		
		if(admCliente.traerCliente(idCliente)==null)throw new Exception("Cliente no existente");
		
		
		admCliente.getLstCliente().remove(idCliente);
		eliminado=true;
		
		return eliminado;
}
	
}
