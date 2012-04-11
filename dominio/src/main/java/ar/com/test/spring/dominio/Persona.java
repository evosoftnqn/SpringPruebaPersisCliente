package ar.com.test.spring.dominio;

import java.io.Serializable;

public abstract class Persona implements Serializable{

	 /**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
	 private int idPersona;
	 private String razonSocial;
	 private String cuitCuil;
	 private String contactoEmpresa;
	 private String telefonoFax;
	 private String mail;
	 private String domicilio;
	 private int codigoPostal;
	 private String ciudad;
	 private int codigoProvincia;
	 private String comentarios;
	 
	 public Persona(){
		 
	 }
	
	public Persona(int idPersona, String razonSocial, String cuitCuil) {
			this(idPersona, razonSocial, cuitCuil, null,null,null,null,0,null,0,null);
	}
	
	public Persona(int idPersona, String razonSocial, String cuitCuil, String contactoEmpresa) {
			this(idPersona, razonSocial, cuitCuil, contactoEmpresa,null,null,null,0,null,0,null);
	}
	
	public Persona(int idPersona, String razonSocial, String cuitCuil, String contactoEmpresa, String telefonoFax) {
			this(idPersona, razonSocial, cuitCuil, contactoEmpresa,telefonoFax,null,null,0,null,0,null);
	}
	
	public Persona(int idPersona, String razonSocial, String cuitCuil, String contactoEmpresa, String telefonoFax,
			String mail) {
			
			this(idPersona, razonSocial, cuitCuil, contactoEmpresa,telefonoFax,mail,null,0,null,0,null);
	}
	
	public Persona(int idPersona, String razonSocial, String cuitCuil, String contactoEmpresa, String telefonoFax,
			String mail, String domicilio) {
			
			this(idPersona,razonSocial,cuitCuil,contactoEmpresa,telefonoFax,mail,domicilio,0,null,0,null);
	}

	public Persona(int idPersona, String razonSocial, String cuitCuil, String contactoEmpresa, String telefonoFax,
			String mail, String domicilio, int codigoPostal) {
			
			this(idPersona,razonSocial,cuitCuil,contactoEmpresa,telefonoFax,mail,domicilio,codigoPostal,null,0,null);
	}
	
	public Persona(int idPersona, String razonSocial, String cuitCuil, String contactoEmpresa, String telefonoFax,
			String mail, String domicilio, int codigoPostal, String ciudad) {
			
			this(idPersona,razonSocial,cuitCuil,contactoEmpresa,telefonoFax,mail,domicilio,codigoPostal,ciudad,0,null);
	}
	
	public Persona(int idPersona, String razonSocial, String cuitCuil, String contactoEmpresa, String telefonoFax,
			String mail, String domicilio, int codigoPostal, String ciudad, int codigoProvincia) {
			
			this(idPersona,razonSocial,cuitCuil,contactoEmpresa,telefonoFax,mail,domicilio,codigoPostal,ciudad,codigoProvincia,null);
	}
	
	/**
	 * @param idPersona
	 * @param razonSocial
	 * @param cuitCuil
	 * @param contactoEmpresa
	 * @param telefonoFax
	 * @param mail
	 * @param domicilio
	 * @param codigoPostal
	 * @param ciudad
	 * @param codigoProvincia
	 * @param comentarios
	 */
	public Persona(int idPersona, String razonSocial, String cuitCuil, String contactoEmpresa, String telefonoFax, 
			String mail, String domicilio, int codigoPostal, String ciudad, int codigoProvincia, String comentarios) {
				
			super();
			this.idPersona = idPersona;
			this.razonSocial= razonSocial;
			this.cuitCuil = cuitCuil;
			this.contactoEmpresa = contactoEmpresa;
			this.telefonoFax = telefonoFax;
			this.mail = mail;
			this.domicilio = domicilio;
			this.codigoPostal = codigoPostal;
			this.ciudad = ciudad;
			this.codigoProvincia = codigoProvincia;
			this.comentarios = comentarios;
			
	}
	
	public int getIdPersona(){
		return idPersona;
	}
	
	public void setIdPersona(int idPersona){
		this.idPersona=idPersona;
	}
	
	// ver porque no se hace el idPersona//
	 
	public String getRazonSocial(){
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial){
		this.razonSocial = razonSocial;
	}
	
	public String getCuitCuil(){
		return cuitCuil;
	}
	public void setCuitCuil(String cuitCuil){
		this.cuitCuil = cuitCuil;
	}
	
	public String getContactoEmpresa(){
		return contactoEmpresa;
	}
	public void setContactoEmpresa(String contactoEmpresa){
		this.contactoEmpresa = contactoEmpresa;
	}
	
	public String getTelefonoFax(){
		return telefonoFax;
	}
	public void setTelefonoFax(String telefonoFax){
		this.telefonoFax = telefonoFax;
	}
	
	public String getMail(){
		return mail;
	}
	public void setMail(String mail){
		this.mail = mail;
	}
	
	public String getDomicilio(){
		return domicilio;
	}
	public void setDomicilio(String domicilio){
		this.domicilio = domicilio;
	}
	
	public int getCodigoPostal(){
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal){
		this.codigoPostal = codigoPostal;
	}
	
	public String getCiudad(){
		return ciudad;
	}
	public void setCiudad(String ciudad){
		this.ciudad = ciudad;
	}
	
	public int getCodigoProvincia(){
		return codigoProvincia;
	}
	public void setCodigoProvincia(int codigoProvincia){
		this.codigoProvincia = codigoProvincia;
	}
	
	public String getComentarios(){
		return comentarios;
	}
	public void setComentarios(String comentarios){
		this.comentarios = comentarios;
	}
	
	@Override 
	public String toString(){
		StringBuilder buffer = new StringBuilder("Persona { ");
		buffer.append("idPersona:");
		buffer.append(idPersona);
		buffer.append("razonSocial:");
		buffer.append(razonSocial);
		buffer.append("cuitCuil:");
		buffer.append(cuitCuil);
		buffer.append("contactoEmpresa:");
		buffer.append(contactoEmpresa);
		buffer.append("telefonoFax:");
		buffer.append(telefonoFax);
		buffer.append("mail:");
		buffer.append(mail);
		buffer.append("domicilio:");
		buffer.append(domicilio);
		buffer.append("codigoPostal:");
		buffer.append(codigoPostal);
		buffer.append("ciudad:");
		buffer.append(ciudad);
		buffer.append("codigoProvincia:");
		buffer.append(codigoProvincia);
		buffer.append("comentarios:");
		buffer.append(comentarios);
		buffer.append(" }");
		return buffer.toString();
	}
	//TODO - Implementar este método de forma consistente con el "contrato"
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj == null || this.getClass() != obj.getClass()) {
			
			return false;
					}
					
			Persona that = (Persona) obj;
					
			return this.idPersona == that.idPersona &&
						
			this.razonSocial == that.razonSocial &&
						
			this.cuitCuil == that.cuitCuil;
	}
	
	@Override
	public int hashCode() {
		int hashResult = 37;
		hashResult = idPersona * hashResult * 17;
		hashResult = razonSocial.hashCode() * hashResult * 17; 
		hashResult = cuitCuil.hashCode() * hashResult * 17; 
		return hashResult;
	}
}