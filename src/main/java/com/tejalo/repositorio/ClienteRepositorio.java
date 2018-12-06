package com.tejalo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tejalo.entidades.Cliente;
import com.tejalo.entidades.Usuario;

public interface ClienteRepositorio extends CrudRepository<Cliente, Long>{

	Cliente findBycodigo(Long codigo);
	 
	 @Query(value = "SELECT * FROM cliente u WHERE u.razon = ?1", nativeQuery = true)
	 Cliente findDataByRazon(String razon);
	  
	
}
