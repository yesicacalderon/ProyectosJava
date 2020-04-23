package stock;

public class Empleado {

	private String nombre;
	private String apellido;
	private int dni;
	Sucursal sucursal;
	public Empleado(String nombre, String apellido, int dni, Sucursal sucursal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sucursal = sucursal;
	}
	
	
	public Empleado(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}


	public Empleado() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	@Override
	public String toString() {
		return "\n Empleado: nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", sucursal=" + sucursal
				+ "]";
	}
	
	
}
