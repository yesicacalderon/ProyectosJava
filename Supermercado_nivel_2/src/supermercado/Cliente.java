package supermercado;

public class Cliente {

	private int idCliente;
	private String cliente;
	private int dni;
	private String direccion;
	private static int contador;

	private Cliente() {

		this.idCliente = ++contador;

	}

	public Cliente(String cliente, int dni, String direccion) {
		this();
		this.cliente = cliente;
		this.dni = dni;
		this.direccion = direccion;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return " idCliente=" + idCliente + ", Nombre=" + cliente + ", dni=" + dni + ", direccion=" + direccion;
	}

}