import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usuariocontroller {

    @RequestMapping("/")
    public String listarUsuarios() {

        System.out.println("USUARIOS");

        return "usuarios";
    }
}
