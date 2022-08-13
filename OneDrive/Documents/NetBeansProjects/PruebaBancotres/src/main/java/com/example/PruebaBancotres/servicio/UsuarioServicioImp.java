/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.PruebaBancotres.servicio;

import com.example.PruebaBancotres.Entedidad.Cliente;
import com.example.PruebaBancotres.Entedidad.Usuario;
import com.example.PruebaBancotres.repositorio.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImp implements UsuarioServicio{
@Autowired
UsuarioRepositorio usrepositorio;
    @Override
    public List<Usuario> listarUsuarios() {
        return  usrepositorio.findAll();
    }

    @Override
    public Usuario insertarUsuario(Usuario usuario) {
        return usrepositorio.save(usuario);
        
    }

    @Override
    public Usuario obtenerusuarioporId(Integer docuemnto) {
        
        return  usrepositorio.findById(docuemnto).get();
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
     return  usrepositorio.save(usuario);
    }

    @Override
    public void eliminarUusario(Integer doc) {
    usrepositorio.deleteById(doc);
        
    }
    
 
    
}
