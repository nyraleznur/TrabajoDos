
package com.example.PruebaBancotres.controlador;

import com.example.PruebaBancotres.servicio.UsuarioServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioControlador {
 
    
    @Autowired
    private UsuarioServicioImp ususervicio;
    
        @GetMapping("/usuario")
    public String listarclientes(Model model){
        model.addAttribute("usuarios",ususervicio.listarUsuarios());
        return "cliente";
    }
}
