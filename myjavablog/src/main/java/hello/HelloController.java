package hello;

import org.springframework.web.bind.annotation.RestController;

import com.mmani.blog.domain.Post;
import com.mmani.blog.service.BlogService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	BlogService blogService;
	
    @RequestMapping("/")
    public String index() {
    	List<Post> blogs = blogService.findAll();
        return "Greetings from Spring Boot!";
    }

}
