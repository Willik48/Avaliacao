package com.atividade.br.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.br.domain.Festinhainfantil;
import com.atividade.br.repositories.FestinhaRepository;
import com.atividade.br.service.exceptions.ObjectNotFoundException;

@Service
public class AtividadeService {
	
	@Autowired
	private FestinhaRepository repo;
	
	public List<Festinhainfantil> listarTodos() {
		return repo.findAll();
	}
	
	public Festinhainfantil buscarPorId(Integer id) {
		Optional<Festinhainfantil> obj = repo.findById(id);
		return obj.orElseThrow( 
				() -> new ObjectNotFoundException(
						"Tarefa não encontrada"));
	}
	
	public void delete(Integer id) {
		buscarPorId(id);
		repo.deleteById(id);
	}
	
	public void update(Festinhainfantil obj) {
		buscarPorId(obj.getId());
		repo.save(obj);
	}

	public void insert(Festinhainfantil obj) {
		obj.setId(null);
		repo.save(obj);
	}
	
	

}
