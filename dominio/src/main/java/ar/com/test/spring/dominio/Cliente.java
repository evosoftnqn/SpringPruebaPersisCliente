package ar.com.test.spring.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table( name="CLIENTE" )
@SuppressWarnings("serial")
public class Cliente extends Persona {
	/**
	 * 
	 */
	@Id
	@GeneratedValue
	private String actividadPrincipal;
	
	public Cliente(){
		
	}
	
	 public Cliente(int idPersona, String razonSocial, String cuitCuil,
			String contactoEmpresa, String telefonoFax, String mail,
			String domicilio, int codigoPostal, String ciudad,
			int codigoProvincia, String comentarios,String actividadPrincipal) 
	 		{
		 
		super(idPersona, razonSocial, cuitCuil, contactoEmpresa, telefonoFax, mail,
				domicilio, codigoPostal, ciudad, codigoProvincia, comentarios);
		this.actividadPrincipal = actividadPrincipal;
		
		// TODO Auto-generated constructor stub
	 			}
	
	 public String  getActividadPrincipal(){
		 return actividadPrincipal;
	 }
	 
	 public void setActividadPrincipal(String actividadPrincipal){
		 this.actividadPrincipal = actividadPrincipal;
	 }
	
}