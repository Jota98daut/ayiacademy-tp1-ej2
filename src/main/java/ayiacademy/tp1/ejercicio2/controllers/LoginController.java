package ayiacademy.tp1.ejercicio2.controllers;

import ayiacademy.tp1.ejercicio2.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginController {
    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/")
    public RedirectView getIndex() {
        return new RedirectView("/login");
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public RedirectView postLogin(@RequestParam String nombre, @RequestParam String password) {
        if (usuariosService.validatePassword(nombre, password))
            return new RedirectView("/proveedores");
        else
            return new RedirectView("/login");
    }
}
