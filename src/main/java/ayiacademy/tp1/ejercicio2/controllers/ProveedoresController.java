package ayiacademy.tp1.ejercicio2.controllers;

import ayiacademy.tp1.ejercicio2.persistence.entities.Proveedor;
import ayiacademy.tp1.ejercicio2.services.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ProveedoresController {
  @Autowired private ProveedoresService proveedoresService;

  @Value("${constants.proveedores-title}")
  private String proveedoresTitle;

  @GetMapping("/proveedores")
  public String getProveedores(Model model) {
    model.addAttribute("titulo", proveedoresTitle);
    model.addAttribute("proveedores", proveedoresService.getAll());
    return "proveedores/index";
  }

  @GetMapping("/proveedores/nuevo")
  public String getNuevoProveedor(Model model) {
    model.addAttribute("proveedor", new Proveedor());
    return "proveedores/nuevo";
  }

  @PostMapping("/proveedores/nuevo")
  public RedirectView postNuevoProveedor(Proveedor proveedor) {
    proveedoresService.save(proveedor);
    return new RedirectView("/proveedores");
  }
}
