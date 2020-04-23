package stock;

import java.time.LocalDate;

public class Lote {

	private Sucursal sucursal;
	private Producto producto;
	private LocalDate fechaAlta;
	private int cantidadInical;
	private int cantidadActual;
	private boolean activo;
	public Lote(Sucursal sucursal, Producto producto, LocalDate fechaAlta, int cantidadInical, int cantidadActual,
			boolean activo) {
		super();
		this.sucursal = sucursal;
		this.producto = producto;
		this.fechaAlta = fechaAlta;
		this.cantidadInical = cantidadInical;
		this.cantidadActual = cantidadActual;
		this.activo = activo;
	}
	
	public Lote(LocalDate fechaAlta, int cantidadInical, int cantidadActual, boolean activo) {
		super();
		this.fechaAlta = fechaAlta;
		this.cantidadInical = cantidadInical;
		this.cantidadActual = cantidadActual;
		this.activo = activo;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public int getCantidadInical() {
		return cantidadInical;
	}
	public void setCantidadInical(int cantidadInical) {
		this.cantidadInical = cantidadInical;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Lote= sucursal=" + sucursal + ", producto=" + producto + ", fechaAlta=" + fechaAlta
				+ ", cantidadInical=" + cantidadInical + ", cantidadActual=" + cantidadActual + ", activo=" + activo
				;
	}
	
	
	
	
}
