package uap.edu.bo.infraestructura.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "LOGIN/login";
    }
    
}
