package com.proyect.Inicio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyect.Inicio.model.TareasModel;

@Service
public interface TareaService {
	
	public List<TareasModel> findAll();
	public TareasModel save(TareasModel tarea);
	public TareasModel findById(Integer id);
	public void delete(Integer id);

}
