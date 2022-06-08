package Escumpani.pe.AppEvaContinua1.service;

import java.util.List;

import Escumpani.pe.AppEvaContinua1.model.Profesor;



public interface ProfesorService {
	
	void guardarProducto(Profesor profesor);
	void actualizarProfesor(Profesor profesor);
	void eliminarProfesor(Integer id);
	List<Profesor> listarProfesor();
	Profesor obtenerProfesorId(Integer id);

}
