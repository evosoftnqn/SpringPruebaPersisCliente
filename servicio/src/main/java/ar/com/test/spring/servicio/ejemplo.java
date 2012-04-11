package ar.com.test.spring.servicio;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.test.spring.dominio.Cliente;

public class ejemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("servicio.xml");
			    ICrudCliente icc = (ICrudCliente) ctx.getBean("iCrudCliente");
			    Cliente cl = (Cliente) ctx.getBean("cliente");
			    cl.setIdPersona(2);
			    cl.setRazonSocial("jose");
			    cl.setCuitCuil("20-12345678-8");
			    cl.setContactoEmpresa("sad");
			    cl.setTelefonoFax("");
			    cl.setMail("skmd@sad.com");
			    cl.setDomicilio("fdg");
			    cl.setCodigoPostal(8300);
			    cl.setCiudad("jhfd");
			    cl.setCodigoProvincia(12);
			    cl.setComentarios("oirt");
			    cl.setActividadPrincipal("irut");
			    
			    
			    icc.save(cl);
	}

}
