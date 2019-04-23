package com.atividade.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade.br.domain.Festinhainfantil;

@Repository
public interface FestinhaRepository extends JpaRepository<Festinhainfantil, Integer> {

}
