package incaaProyecto;

import java.util.List;

public class Incaa {

	List<Pelicula>catalogo;

	

	public Incaa(List<Pelicula> catalogo) {
		super();
		this.catalogo = catalogo;
	}



	public List<Pelicula> getCatalogo() {
		return catalogo;
	}



	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}



	@Override
	public String toString() {
		return " Catalogo= " + catalogo;
	}


	public Pelicula traerPelicula(int idPelicula) {
		 Pelicula existente=null;
		int index=0;
		
		while (index<catalogo.size()) {
			
			if(catalogo.get(index).getIdPelicula()==idPelicula) {
				
				existente=catalogo.get(index);
				
			}
			
			index++;		
		} 
		
		
		return existente;
	}
	
	public Pelicula traerPelicula(String Pelicula){
		Pelicula existe=null;
		 int index=0; 
		 
		 while(index<catalogo.size()) {
			 
			 if(catalogo.get(index).getPelicula().equalsIgnoreCase(Pelicula)) {
				 
				 existe=catalogo.get(index);
			 }
			 
			 index++;
		 }
		 
		return existe;
	}
	
	public boolean agregarPelicula(String pelicula)throws Exception {
		boolean confirmacion=false;
		int posicion;
	    
		if(traerPelicula(pelicula)!=null)throw new Exception("Pelicula Existente");
		
		posicion=catalogo.get(catalogo.size()-1).getIdPelicula()+1;
		
		catalogo.add(new Pelicula (posicion,pelicula));	
		
		return confirmacion;
	}
	
	public boolean modificarPelicula(int idPelicula, String pelicula)throws Exception {
		boolean confirmacion=false;
		int index=0;
		if(traerPelicula(idPelicula)==null)throw new Exception ("No existe Pelicula a Modificar");
		
		while (index<catalogo.size()) {
		
			if(catalogo.get(index).getIdPelicula()==idPelicula) {
			catalogo.get(index).setPelicula(pelicula);
			confirmacion=true;
		}
		index++;	
		}
         
		
		return confirmacion;
	}
	
	public boolean eliminarPelicula (int idPelicula)throws Exception{
		boolean eliminado=false;
		int index=0;
		if(traerPelicula(idPelicula)==null)throw new Exception ("Pelicula no encontrada para eliminar");
		
		while (index<catalogo.size()) {
		
			if(catalogo.get(index).getIdPelicula()==idPelicula) {
				
				catalogo.remove(index);
				eliminado=true;
			}
			index++;
		}
		
		return eliminado;
	}
	
}
