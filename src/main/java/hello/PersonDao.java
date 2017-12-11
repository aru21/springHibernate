package hello;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

@Component
public class PersonDao 
{
	 @PersistenceContext
	  private EntityManager entityManger;

	 @Transactional
	 public void addPerson(Person p)
	 {
		entityManger.persist(p);
	 }
	
	 @SuppressWarnings("unchecked")
	public List<Person> getData()
	 {
		 List<Person> list = new ArrayList<Person>();
		 String hql = "SELECT u FROM Person u";
		 list = (List<Person>) entityManger.createQuery(hql).getResultList(); 
		 System.out.println(list);  
		 
		 for (Person person : list) {
			System.out.println(person);
		}
		 return list;
	 }
	 
	 
}
