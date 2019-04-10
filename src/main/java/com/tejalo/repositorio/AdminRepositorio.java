package com.tejalo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tejalo.entidades.Admin;
import com.tejalo.entidades.Cliente;
import com.tejalo.entidades.Usuario;

public interface AdminRepositorio extends CrudRepository<Admin, Long>{

	Admin findBycodigo(Long codigo);
	
	 @Query(value = "SELECT * FROM admin adm WHERE adm.correo = ?1", nativeQuery = true)
	 Admin findByEmail(String email);

	 @Query(value = "SELECT * FROM admin adm WHERE adm.ruc = ?1", nativeQuery = true)
	 Admin findByRUC(String ruc);
}
