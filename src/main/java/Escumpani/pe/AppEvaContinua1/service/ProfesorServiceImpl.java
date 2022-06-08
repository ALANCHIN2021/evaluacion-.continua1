package Escumpani.pe.AppEvaContinua1.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import Escumpani.pe.AppEvaContinua1.model.Profesor;
import Escumpani.pe.AppEvaContinua1.repository.ProfesorRepository;



@Repository
public class ProfesorServiceImpl implements ProfesorService {
	
	
	
	@Autowired
	private ProfesorRepository repository;

	@Override
	public void guardarProducto(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.save(profesor);
		
	}

	@Override
	public void actualizarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(profesor);
		
	}

	@Override
	public void eliminarProfesor(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public List<Profesor> listarProfesor() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Profesor obtenerProfesorId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
