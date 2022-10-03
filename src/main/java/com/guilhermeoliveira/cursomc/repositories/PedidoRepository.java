package com.guilhermeoliveira.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilhermeoliveira.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer> {
	
}
