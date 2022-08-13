
package com.example.PruebaBancotres.servicio;

import com.example.PruebaBancotres.Entedidad.Cliente;
import java.util.List;


public interface ClienteServicio {
    
    public List<Cliente> listarclientes();
    public Cliente guardarcliente(Cliente cliente);
    public Cliente obtenerclientePorId(Integer docunemto);
    public Cliente actualizarCliente(Cliente cliente);
    public void eliminarCliente(Integer docunemto);
}
