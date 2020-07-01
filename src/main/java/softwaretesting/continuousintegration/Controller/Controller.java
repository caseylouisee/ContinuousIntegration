package softwaretesting.continuousintegration.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String home() {
        return "Spring boot is working! Morning!";
    }
}