package ar.com.test.spring.servicio;

import ar.com.test.spring.dominio.Cliente;
import ar.com.test.spring.persistencia.Dao;

public class CrudCliente implements ICrudCliente {
	
	
	  private Dao dao;
	   
	  public void setDao(Dao dao) {
	    this.dao = dao;
	  }
	

	public void save(Cliente cliente) {
		
		dao.saves(cliente);
	}

}
