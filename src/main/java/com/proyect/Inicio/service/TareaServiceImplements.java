package com.proyect.Inicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyect.Inicio.dao.DaoTareas;
import com.proyect.Inicio.model.TareasModel;

@Service
public class TareaServiceImplements implements TareaService{
	
	@Autowired
	private DaoTareas tareaDao;

	@Override
	@Transactional(readOnly=true)
	public List<TareasModel> findAll() {
		
		return (List<TareasModel>) tareaDao.findAll();
	}

	@Override
	@Transactional(readOnly=false)
	public TareasModel save(TareasModel tarea) {
		
		return tareaDao.save(tarea);
	}

	@Override
	@Transactional(readOnly=true)
	public TareasModel findById(Integer id) {
		
		return tareaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Integer id) {
		
		tareaDao.deleteById(id);
	}

}
