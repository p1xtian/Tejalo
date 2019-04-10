package com.tejalo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tejalo.entidades.Admin;
import com.tejalo.entidades.Cliente;
import com.tejalo.entidades.Tipos;
import com.tejalo.entidades.Usuario;

public interface TipoRepositorio extends CrudRepository<Tipos, Long>{

	Tipos findBycodigo(Long codigo);
	
}
