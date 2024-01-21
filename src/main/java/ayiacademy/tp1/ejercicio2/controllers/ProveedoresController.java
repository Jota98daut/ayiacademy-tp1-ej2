package ayiacademy.tp1.ejercicio2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ayiacademy.tp1.ejercicio2.services.ProveedoresService;

@Controller
public class ProveedoresController {
    @Autowired
    private ProveedoresService proveedoresService;

    @Value("${constants.proveedores-title}")
    private String proveedoresTitle;

    @GetMapping("/proveedores")
    public String getProveedores(Model model) {
        model.addAttribute("titulo", proveedoresTitle);
        model.addAttribute("proveedores", proveedoresService.getAll());
        return "proveedores/index";
    }
}
