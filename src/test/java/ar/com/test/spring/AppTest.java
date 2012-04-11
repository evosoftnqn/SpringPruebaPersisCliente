package ar.com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.test.spring.dominio.Cliente;
import ar.com.test.spring.servicio.ICrudCliente;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest   extends TestCase{
	
	 public void testSample2() throws Exception {
		    ApplicationContext ctx = new ClassPathXmlApplicationContext(
		        "servicio.xml");
		    ICrudCliente icc = (ICrudCliente) ctx.getBean("iCrudCliente");
		    Cliente cl = new Cliente();
		    cl.setIdPersona(1);
		    cl.setRazonSocial("jose");
		    cl.setCuitCuil("20-12345678-8");
		    icc.save(cl);
	 }
	 
	
	 
	 
}
