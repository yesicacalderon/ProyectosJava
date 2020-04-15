package prueba;

import incaaProyecto.Pelicula;

import java.util.ArrayList;
import java.util.List;
import incaaProyecto.Incaa;

public class PruebaIncaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula p1=new Pelicula(1,"Destino Final");
		Pelicula p2=new Pelicula(2,"La casa de cera");
		Pelicula p3=new Pelicula(3,"Guerra de papas");
		
		List<Pelicula>listPeliculas=new ArrayList<Pelicula>();
		listPeliculas.add(p1);
		listPeliculas.add(p2);
		listPeliculas.add(p3);
		
		Incaa catalogo1=new Incaa (listPeliculas);
		
		System.out.println(catalogo1);
		
		System.out.println(" Traer Pelicula por id: "+catalogo1.traerPelicula(2));
		
		System.out.println(" Traer pelicula por titulo: "+ catalogo1.traerPelicula("Guerra de papas 3"));
		
			
		try {
			catalogo1.agregarPelicula("Guerra de papas");
		} catch (Exception e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" Peliculas agregadas: "+ catalogo1);
	
		try {
			catalogo1.modificarPelicula(1, "Hola!");
			
		} catch (Exception e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Pelicula Modificada: "+ catalogo1);
		
		try {
			catalogo1.eliminarPelicula(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Pelicula eliminada: "+ catalogo1);
	}
	
	     

}
