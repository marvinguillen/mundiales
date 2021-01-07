package com.mundiales.navegar.services;

import com.mundiales.navegar.repositories.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mundiales.navegar.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public List<UsuarioModel>  ObtenerUsuarios()
    {
        List<UsuarioModel> registros =new ArrayList<>();
        usuarioRepository.findAll().forEach(registros::add);
 
        return registros;
 
         //  return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
    }
    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
    public Optional<UsuarioModel> ObtetenerporId(long id){
        return usuarioRepository.findById(id);

    }
    public ArrayList<UsuarioModel> findByPrioridad(Integer prioridad){
            return usuarioRepository.findByPrioridad(prioridad);
    }
  
    public boolean EliminarporId(long id){
        try {
            usuarioRepository.deleteById(id);
            return true; 
        } catch (Exception e) {
          
            return false;
        }
    }
}
