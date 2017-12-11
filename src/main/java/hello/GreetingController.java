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
    public String greeting(@RequestParam(value="name", required=false, defaultValue="ACE") String name, Model model) 
    {
    	Person person = new Person("Arpit" , 24);
    	personDao.addPerson(person);
    	model.addAttribute("name", person.name);
    	personDao.getData();
    	return "greeting";
    }

}