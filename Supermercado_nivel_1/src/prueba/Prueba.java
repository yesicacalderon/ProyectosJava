package prueba;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import supermercado.Carrito;
import supermercado.ItemCarrito;
import supermercado.Producto;
import supermercado.Supermercado;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto pro1 = new Producto("Harina", 20);
		Producto pro2 = new Producto("Arroz", 50);
		Producto pro3 = new Producto("Manteca", 80);

		List<Producto> listProductos = new ArrayList<Producto>();
		listProductos.add(pro1);
		listProductos.add(pro2);
		listProductos.add(pro3);

		Supermercado gondola = new Supermercado(listProductos);

		ItemCarrito listCarrito1 = new ItemCarrito(pro1, 25);
		ItemCarrito listCarrito2 = new ItemCarrito(pro2, 8);

		List<ItemCarrito> listaCarrito = new ArrayList<ItemCarrito>();
		listaCarrito.add(listCarrito1);
		listaCarrito.add(listCarrito2);

		Carrito c1 = new Carrito(1, LocalDate.now(), LocalTime.now(), listaCarrito);

		System.out.println(gondola);

		System.out.println("\n Traer producto: " + gondola.traerProducto(3));

		try {
			System.out.println(" \n Agregado: " + gondola.agregarProducto("aceite", 150));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			gondola.modificarProducto(7, "Helado", 420);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\n Productos Modificados: " + gondola);

		try {
			gondola.eliminarProducto(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\n Producto eliminado: " + gondola);

		System.out.println("\n Producto agregado: " + c1.agregarItem(pro3, 20));

		System.out.println(c1);

		try {
			c1.eliminarItem(pro3, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Eliminado cantidad" + c1);

		System.out.println("\n El total a pagar es de: $" + c1.calcularTotal());

	}

}
