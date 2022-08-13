/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.PruebaBancotres.servicio;

import com.example.PruebaBancotres.Entedidad.Cliente;
import com.example.PruebaBancotres.Entedidad.Usuario;
import java.util.List;

/**
 *
 * @author nyral
 */
public interface UsuarioServicio {
   public List<Usuario> listarUsuarios();
   
   public Usuario insertarUsuario(Usuario usuario);
   public Usuario obtenerusuarioporId(Integer docuemnto);
   public Usuario actualizarUsuario(Usuario usuario);
   public void eliminarUusario(Integer documento);
}
