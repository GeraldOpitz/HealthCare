package com.healthtrack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {

    private Usuario usuario = new Usuario("Gerald", 80);

    @GetMapping("/")
    public String mostrarUsuario(Model model) {
        model.addAttribute("usuario", usuario);
        return "usuario";
    }

    @PostMapping("/actualizarPeso")
    public String actualizarPeso(@RequestParam("nuevoPeso") double nuevoPeso, Model model) {
        usuario.actualizarPeso(nuevoPeso);
        model.addAttribute("usuario", usuario);
        model.addAttribute("mensaje", "Peso actualizado a: " + usuario.getPeso() + " kg");
        return "usuario";
    }
}
