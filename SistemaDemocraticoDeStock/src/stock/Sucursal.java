package stock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sucursal {

	private int idSucursal;
	private String direccion;
	private List<Empleado>empleados= new ArrayList<Empleado>();
	private List<Lote>lotes=new ArrayList<Lote>();
	private static int contador;
	
	private Sucursal() {
		super();
		this.idSucursal=++contador;	
		
	}
	
	public Sucursal(String direccion, List<Empleado> empleados, List<Lote> lotes) {
		this();
		this.direccion = direccion;
		this.empleados = empleados;
		this.lotes = lotes;
	}
   

	public Sucursal( String direccion) {
		this();
		this.direccion = direccion;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	@Override
	public String toString() {
		return "\n Sucursal: idSucursal=" + idSucursal + ", direccion=" + direccion 
			;
	}
	
	public boolean agregarEmpleado(String nombre, String apellido, int dni) {
		
		boolean agregado=false;
		
		this.empleados.add(new Empleado(nombre,apellido,dni, Sucursal.this));
		agregado=true;

		return agregado;
	}
	
	public Empleado traerEmpleado(int dni) {
		Empleado emp=null;
		int index=0;
		
		while(index<empleados.size()) {
			if(empleados.get(index).getDni()==dni) {
				
				emp=empleados.get(index);
			}
			index++;
		}
		return emp;
	}
	
	public boolean agregarLote(Producto producto, LocalDate fechaAlta, int cantidadInicial) {
		boolean agregado=false;	
			
		lotes.add(new Lote(Sucursal.this,producto,fechaAlta,cantidadInicial,cantidadInicial,true));
			agregado=true;
			
			return agregado;
		}
		
	public List<Lote> traerLotesActivos(Producto producto){
		
		List<Lote> lote=new ArrayList<Lote>();
		int index=0;
		
		while(index<lotes.size()) {
			if(lotes.get(index).getProducto().equals(producto)) {
				if(lotes.get(index).isActivo()) {
				lote.add(lotes.get(index));
			}}
			index++;
			
		}
		return lote;
	}
	
	public int traerCantidad(Producto producto) {
		int cantidad=0;
		int index=0;
		while(index<lotes.size()) {
			if(lotes.get(index).getProducto().equals(producto)) {
				
				cantidad=cantidad+lotes.get(index).getCantidadActual();
				
			}
			
			index++;
		}
		
		return cantidad;
	}
}
