package com.mundiales.navegar.repositories;

import java.util.ArrayList;
import java.util.List;

import com.mundiales.navegar.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

    List<UsuarioModel> findByemail(String email);
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
    List<UsuarioModel> findByPrioridadLessThan(Integer prioridad);

}