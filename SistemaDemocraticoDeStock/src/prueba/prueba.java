package prueba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import stock.Comprobante;
import stock.Empleado;
import stock.Lote;
import stock.Producto;
import stock.Remito;
import stock.SistemaStock;
import stock.SolicitudStock;
import stock.Sucursal;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Producto("Producto 1", 20.5);
		Producto p2 = new Producto("Producto 2", 15.5);
		Sucursal s1 = new Sucursal("sucursal 1");
		Sucursal s2 = new Sucursal("Sucursal 2");
		Empleado e1 = new Empleado("Juan", "gomez", 11111111, s1);
		Empleado e2 = new Empleado("Julian", "suarez", 22222222, s2);
		Lote l1=new Lote(s1,p1,LocalDate.of(2019, 10, 1),100,100,true);
		Lote l2=new Lote(s1,p2,LocalDate.of(2019, 10, 1),50,50,true);
		Lote l3=new Lote(s1,p1,LocalDate.of(2019, 10, 3),40,40,true);
		Lote l4=new Lote(s2,p1,LocalDate.of(2019, 10, 2),80,80,true);
		Lote l5=new Lote(s2,p2,LocalDate.of(2019, 10, 2),80,80,true);
		
		List<Lote>loteS1=new ArrayList<Lote>();
		List<Lote>loteS2=new ArrayList<Lote>();
		loteS1.add(l1);
		loteS1.add(l2);
		loteS1.add(l3);
		loteS2.add(l4);
		loteS2.add(l5);
		
		s1.setLotes(loteS1);
		s2.setLotes(loteS2);
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(p1);
		productos.add(p2);
		List<Sucursal> sucursales = new ArrayList<Sucursal>();
		sucursales.add(s1);
		sucursales.add(s2);
		List<Empleado> empleadosS1 = new ArrayList<Empleado>();
		empleadosS1.add(e1);
		List<Empleado>empleadosS2=new ArrayList<Empleado>();
		empleadosS2.add(e2);
		s1.setEmpleados(empleadosS1);
		s2.setEmpleados(empleadosS2);
		
		SistemaStock sistemaStock = new SistemaStock();
		sistemaStock.setProductos(productos);
		sistemaStock.setSucursales(sucursales);
		
		Remito remito1= new Remito();
		SolicitudStock stock1= new SolicitudStock();
		
		List<Comprobante>listComprobantes=new ArrayList<Comprobante>();
		listComprobantes.add(remito1);
		listComprobantes.add(stock1);
		
		
		
		System.out.println("Traer producto" + sistemaStock.traerProducto("Producto 2"));
		try {
			sistemaStock.agregarProducto("Producto 4", 20.6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Productos agregados" + sistemaStock.getProductos());

		try {
			sistemaStock.agregarSucursal("Sucursal 3");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\n *Traer sucursal por direccion: " + sistemaStock.traerSucursal(1));
		System.out.println("\n *Traer sucursal por id: " + sistemaStock.traerSucursal(1));
		System.out.println(" *Sucursales agregadas: " + sistemaStock.getSucursales());
		
		System.out.println(" *Traer producto por id: " + sistemaStock.traerProducto(2));

		System.out.println("Empleados"+s1.agregarEmpleado("Zoe", "lopez", 33333333));
		
		System.out.println(" Sucursal: "+s2);
		
		System.out.println("Traer Empleado: "+s1.traerEmpleado(11111111));
		
		  System.out.println(s1.agregarLote(p1, LocalDate.now(), 100));
		  
		  System.out.println(" Traer lotes: "+s1.traerLotesActivos(p1));
		  System.out.println(" Traer Cantidad: "+ s1.traerCantidad(p1));
		  
		  //System.out.println((LocalDate.now(), p1, 5, e1, "Forma de Pago 1"));
		  
		  System.out.println(sistemaStock.generarRemitoDeConsumo(LocalDate.now(), p1, 10, e1, "Forma de pago 1"));
		  
		 
		
	}

}
