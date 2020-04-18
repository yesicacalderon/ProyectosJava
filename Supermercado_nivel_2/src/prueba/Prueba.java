package prueba;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import supermercado.AdmCarrito;
import supermercado.AdmCliente;
import supermercado.AdmProducto;
import supermercado.Carrito;
import supermercado.Cliente;
import supermercado.ItemCarrito;
import supermercado.Producto;
import supermercado.Supermercado;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto prod1 = new Producto("Harina", 50);
		Producto prod2 = new Producto("Aceite", 130);
		Producto prod3 = new Producto("Arroz", 55);

		List<Producto> listProductos = new ArrayList<Producto>();
		listProductos.add(prod1);
		listProductos.add(prod2);
		listProductos.add(prod3);

		AdmProducto admP1 = new AdmProducto(listProductos);

		ItemCarrito iCar1 = new ItemCarrito(prod1, 3);
		ItemCarrito iCar2 = new ItemCarrito(prod2, 1);
		ItemCarrito iCar3 = new ItemCarrito(prod3, 2);
		List<ItemCarrito> listItemCarrito = new ArrayList<ItemCarrito>();
		listItemCarrito.add(iCar1);
		listItemCarrito.add(iCar2);
		listItemCarrito.add(iCar3);

		Cliente c1 = new Cliente("Yesica", 35152042, "Bustos 944");
		Cliente c2 = new Cliente("Rex", 54151344, "Olmos 221");
		List<Cliente> listCliente=new ArrayList<Cliente>();
		listCliente.add(c1);
		listCliente.add(c2);
		AdmCliente admCliente=new AdmCliente(listCliente);
	
		Carrito car = new Carrito(LocalDate.now(), LocalTime.now(), listItemCarrito, c1);
		List<Carrito> listCarrito=new ArrayList<Carrito>();
		AdmCarrito admCarrito=new AdmCarrito(listCarrito);
		
		Supermercado supermercado=new Supermercado(admP1,admCliente,admCarrito);
		
		
		  System.out.println(admP1);// imprime lista de Productos
		  
		  admP1.agregarProducto("Fideo", 80);
		  System.out.println(" Producto agregado: \n" + admP1);// Muestra lista de productos con producto agregado // recientemente
		  
		  
		  System.out.println(" \n Producto solicitado: " + admP1.traerProducto(3));//muestra el producto solicitado
		  
		  admP1.eliminarProducto(4); System.out.println("\n Producto eliminado: \n" +
		  admP1); car.agregarItem(prod3, 5);
		  System.out.println(" Producto agregado al Carrito de compras: \n" + car);
		  car.eliminarItem(prod1, 1);
		  System.out.println(" Item modificado o eliminado de la lista de Productos: "
		  + car); System.out.println("El total a pagar es de: $" +
		  car.calcularTotal());
		 
		 
		  try {
			System.out.println(supermercado.eliminarCliente(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		System.out.println(supermercado.getAdmCliente().getLstCliente());
		
	}
	
	  

}
