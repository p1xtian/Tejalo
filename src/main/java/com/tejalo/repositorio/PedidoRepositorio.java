package com.tejalo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tejalo.entidades.Pedido;

public interface PedidoRepositorio extends CrudRepository<Pedido, Long>{

	Pedido findBycodigo(Long codigo);
	 
	 @Query(value = "SELECT * FROM pedido u WHERE u.ruc = ?1", nativeQuery = true)
	 Pedido findDataByDNI(String ruc);
	 
	
}
