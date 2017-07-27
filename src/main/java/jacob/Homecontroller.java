package jacob;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class Homecontroller {


@RequestMapping("/")
public String homepage(Model model) {
    model.addAttribute("message","Jelly Doughnut");
    return "home";
}

}