
package com.example.PruebaBancotres.controlador;

import com.example.PruebaBancotres.Entedidad.Cliente;
import com.example.PruebaBancotres.repositorio.ClienteRepositorio;
import com.example.PruebaBancotres.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteControlador {
    
    
    @Autowired
    private ClienteServicio servicio;
    @GetMapping("/cliente")
    public String listarclientes(Model model){
        model.addAttribute("clientes",servicio.listarclientes());
        return "cliente";
    }
    
    
    
     @GetMapping("/cliente/nuevo")

    public String formularioregistrocliente(Model modelo){
        modelo.addAttribute("clienteinsertar", new Cliente());
        return "insertarcliente";
    }

//    @Autowired
//    private ClienteRepositorio repositorio;
//    @PostMapping("/cliente/guardar")
//
//    public String registrardatoscliente(Cliente cliente){
//        Cliente clienteguardar=repositorio.save(new Cliente(cliente.getDocunemto(), cliente.getNombre(), cliente.getApellido(), cliente.getCorreo(), cliente.getCelular(),cliente.getEdad(),cliente.getFecha()));
//        return "redirect:/cliente";
//    }
    
    
    
    @PostMapping("/cliente/guardar")
    public String guardarcliente(@ModelAttribute("cliente")Cliente cliente){
        servicio.guardarcliente(cliente);
         return "redirect:/cliente";
    }
    
     
   @GetMapping("/editar/{doca}")
    public String mostrarFormularioDeEditar(@PathVariable("doca") Integer docunemto, Model model){
        model.addAttribute("clientemodificar", servicio.obtenerclientePorId(docunemto));
        return "editarcliente";
    }
    
//    @Autowired
//    ClienteRepositorio cr;
//    @GetMapping("/cliente/editar/{id}")
//   
//     public String mostrarfrmeditarcliente(@PathVariable("id")Integer id,Model modelo){
//        cr.findById(id).get();
//        modelo.addAttribute("cliente",new Cliente(id));
//        modelo.addAttribute("clientes", servicio.listarclientes());
//        return "editarcliente";
//   }
//    
    
    
    @PostMapping("/guardareditado/{doca}")
    public String actualizarCliente(@PathVariable("doca") Integer docunemto, @ModelAttribute("cliente") Cliente cliente, Model model){
       Cliente clienteexistente=servicio.obtenerclientePorId(docunemto);
       //clienteexistente.setDocunemto(cliente.getDocunemto());
       clienteexistente.setNombre(cliente.getNombre());
       clienteexistente.setApellido(cliente.getApellido());
       clienteexistente.setCelular(cliente.getCelular());
       clienteexistente.setCorreo(cliente.getCorreo());
       clienteexistente.setEdad(cliente.getEdad());
       clienteexistente.setFecha(cliente.getFecha());
         
       servicio.actualizarCliente(clienteexistente);


          
        return "redirect:/cliente";
    }
    
    
    /*@GetMapping("/cliente/{id}")
    public String eliminarEstudiante(@PathVariable Integer id){
        servicio.eliminarCliente(id);
        return "redirect:/cliente";
    }*/
}
