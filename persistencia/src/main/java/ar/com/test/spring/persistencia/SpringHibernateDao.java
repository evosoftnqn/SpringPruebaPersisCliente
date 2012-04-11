package ar.com.test.spring.persistencia;

import org.hibernate.*;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;

import ar.com.test.spring.dominio.Cliente;

public class SpringHibernateDao  implements Dao{

	/**private HibernateTemplate hibernateTemplate;
HibernateTransactionManager instancia = new HibernateTransactionManager();
    
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.instancia = new HibernateTransactionManager(sessionFactory);
    }
	
	HibernateTemplate hibernateTemple = new HibernateTemplate(instancia.getSessionFactory());*/
	
	private HibernateTemplate hibernateTemplate;
	public final void setSessionFactory(SessionFactory sessionFactory) {
		if (this.hibernateTemplate == null || sessionFactory != this.hibernateTemplate.getSessionFactory()) {
			this.hibernateTemplate = createHibernateTemplate(sessionFactory);
		}
	}
	protected HibernateTemplate createHibernateTemplate(SessionFactory sessionFactory) {
		return new HibernateTemplate(sessionFactory);
	}
	public final void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	public void saves(Cliente cliente){
		
		hibernateTemplate.saveOrUpdate(cliente);
	}
	 
	
}
