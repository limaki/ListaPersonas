package com.proyect.Inicio.dao;
import org.springframework.data.repository.CrudRepository;
import com.proyect.Inicio.model.TareasModel;

public interface DaoTareas extends CrudRepository<TareasModel, Integer>{

}
