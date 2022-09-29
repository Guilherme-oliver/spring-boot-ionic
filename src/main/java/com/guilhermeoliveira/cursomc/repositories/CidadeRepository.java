package com.guilhermeoliveira.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilhermeoliveira.cursomc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer> {
	
}
