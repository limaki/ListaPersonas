package com.proyect.Inicio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	
	@Entity
	@Table(name="tb_tarea")//nombredeTabla
	public class TareasModel {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="Id")
		private Integer Id;
		
		@Column(name="Tarea")
		private String Tarea;
		
		@Column(name="Finalizado")
		private Boolean Finalizado;
		
		
		
		
		

		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public String getTarea() {
			return Tarea;
		}

		public void setTarea(String tarea) {
			Tarea = tarea;
		}

		public Boolean getFinalizado() {
			return Finalizado;
		}

		public void setFinalizado(Boolean finalizado) {
			Finalizado = finalizado;
		}

}
