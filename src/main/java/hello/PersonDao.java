package hello;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {

@Autowired	
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Transactional
	public void addPerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(p);
		System.out.println("DAO");
		
	}
	
}
