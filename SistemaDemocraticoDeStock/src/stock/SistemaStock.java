package stock;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaStock {
	
	private List<Producto>productos;
	private List<Comprobante>comprobantes=new ArrayList<Comprobante>();
	private List<Sucursal>sucursales;
	public SistemaStock(List<Producto> productos, List<Comprobante> comprobantes, List<Sucursal> sucursales) {
		super();
		this.productos = productos;
		this.comprobantes = comprobantes;
		this.sucursales = sucursales;
	}
	
	
	
	public SistemaStock() {
		super();
	}



	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public List<Comprobante> getComprobantes() {
		return comprobantes;
	}
	public void setComprobantes(List<Comprobante> comprobantes) {
		this.comprobantes = comprobantes;
	}
	public List<Sucursal> getSucursales() {
		return sucursales;
	}
	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}
	
	public Producto traerProducto (String descripcion) {
		Producto traerP=null;
		int index=0;
		
		while(index<productos.size()) {
			if(productos.get(index).getDescripcion().equalsIgnoreCase(descripcion)) {
				
				traerP=productos.get(index);
			}
			
			index++;
		}
		
		return traerP;
	}
	
	public boolean agregarProducto(String descripcion, double precioUnitario)throws Exception {
		boolean agregado=false;
		
		if(traerProducto(descripcion)!=null)throw new Exception ("Producto existente"); 
		
		productos.add(new Producto(descripcion,precioUnitario));
		agregado=true;
		
		return agregado;
	}
	public Sucursal traerSucursal (String direccion) {
		Sucursal traerS=null;
		int index=0;
		
		while(index<sucursales.size()) {
			if(sucursales.get(index).getDireccion().equalsIgnoreCase(direccion)) {
				
				traerS=sucursales.get(index);
				
			}
			
			index++;
		}
		
		return traerS;
	}
	
	
	public boolean agregarSucursal(String direccion)throws Exception {
		boolean agregar=false;
		
		if(traerSucursal(direccion)!=null)throw new Exception("Sucursal ya existente");
		
		sucursales.add(new Sucursal(direccion,null,null));
		agregar=true; 
		
		return agregar;
	}
	
	public Sucursal traerSucursal(int idSucursal) {
		
		Sucursal traer=null;
		int index=0;

		while (index<sucursales.size()) {
			
			if(sucursales.get(index).getIdSucursal()==idSucursal) {
				
				traer=sucursales.get(index);
				
			}
			
			index++;
		}
		
		return traer;
	}
	
	public Producto traerProducto(int idProducto) {
		Producto traer=null;
		int index=0;
		
		while(index<productos.size()) {
			
			if(productos.get(index).getIdProducto()==idProducto) {
				
				traer=productos.get(index);
			}
			index++;
		}
		return traer;
	}
	
public Remito generarRemitoDeConsumo(LocalDate fecha, Producto producto, int cantidad, Empleado vendedor, String formaDePago) {
		
		Remito generado=new Remito();
		
		generado.setFecha(fecha);
		generado.setProducto(producto);
		generado.setCantidad(cantidad);
		generado.setVendedor(vendedor);
		generado.setFormaDePago(formaDePago);
		
		return generado;
	}

	
}
