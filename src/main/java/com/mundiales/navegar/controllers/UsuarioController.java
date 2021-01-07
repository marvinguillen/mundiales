package com.mundiales.navegar.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mundiales.navegar.models.UsuarioModel;
import com.mundiales.navegar.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @GetMapping()
    public List<UsuarioModel> obtenerUsuarios(){
        return usuarioService.ObtenerUsuarios();
    }
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioporId(@PathVariable("id") long id){
        return this.usuarioService.ObtetenerporId(id);
    }
    @GetMapping(path = "/query")
    public ArrayList<UsuarioModel> obtenerUsuarioporPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.findByPrioridad(prioridad);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUsuarioporId(@PathVariable("id") long id){
        boolean ok =this.usuarioService.EliminarporId(id);
        if (ok){
            return "Se elimino el usuario con el id " +id;
        }
        else{
            return "No se elimino el usuario con el id " +id;
        }
    }
}
