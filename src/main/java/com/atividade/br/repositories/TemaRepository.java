package com.atividade.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade.br.domain.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Integer> {

}
