package com.example.PruebaBancotres.servicio;
import com.example.PruebaBancotres.Entedidad.Cliente;
import com.example.PruebaBancotres.repositorio.ClienteRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiciosImp  implements ClienteServicio{
    
    @Autowired
    private ClienteRepositorio repositorio;
    
    
    @Override
    public List<Cliente> listarclientes() {
       return repositorio.findAll();
    }

    @Override
    public Cliente guardarcliente(Cliente cliente) {
        return repositorio.save(cliente);
    }

    @Override
    public Cliente obtenerclientePorId(Integer docunemto) {
       return repositorio.findById(docunemto).get();
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
      return repositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Integer docunemto) {
        
       repositorio.deleteById(docunemto);
       
    }
    
    
  
 
    
    
}
