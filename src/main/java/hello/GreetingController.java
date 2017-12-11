package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@Autowired
	PersonDao personDao;
	
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="ACE") String name, Model model) {
        System.out.println("inside greeting controller");
    	Person person = new Person();
    	person.setAge(24);
    	person.setName("Arpit");
    
    	personDao.addPerson(person);
    	
        return "greeting";
    }

}