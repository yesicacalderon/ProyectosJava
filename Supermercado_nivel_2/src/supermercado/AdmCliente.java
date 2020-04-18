package supermercado;

import java.util.List;

public class AdmCliente {

	List<Cliente> lstCliente;

	public AdmCliente(List<Cliente> lstCliente) {
		super();
		this.lstCliente = lstCliente;
	}

	public List<Cliente> getLstCliente() {
		return lstCliente;
	}

	public void setLstCliente(List<Cliente> lstCliente) {
		this.lstCliente = lstCliente;
	}

	@Override
	public String toString() {
		return "Lista de Clientes=" + lstCliente;
	}
	
	public Cliente traerCliente(int idCliente) {
		
		Cliente traer=null;
		int index=0;
		
		while(index<lstCliente.size()) {
			
			if(lstCliente.get(index).getIdCliente()==idCliente) {
				
				traer=lstCliente.get(index);	
			}
			index++;
		}
		
		return traer;
	}
	
	
	public boolean agregarCliente(String cliente, int dni, String direccion)throws Exception {
		boolean agregar=false;
		int index=0;
		
		while(index<lstCliente.size()) {
			if(lstCliente.get(index).getDni()==dni)throw new Exception("Cliente ya existente");
			
			index ++;		
		}
		
		lstCliente.add(new Cliente(cliente,dni,direccion));
		agregar=true;
		
		return agregar;
	}
	

}
	

