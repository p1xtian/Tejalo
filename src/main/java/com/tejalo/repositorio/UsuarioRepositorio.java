package com.tejalo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tejalo.entidades.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Long>{

	Usuario findBycodigo(Long codigo);
	 
	 @Query(value = "SELECT * FROM usuario u WHERE u.dni = ?1", nativeQuery = true)
	 Usuario findDataByDNI(String DNI);
	 
	 @Query(value = "SELECT * FROM usuario u WHERE u.email = ?1", nativeQuery = true)
	 Usuario findDataByemail(String email);
	 
	 
	 @Query(value = "SELECT TOP 1 * FROM usuario u WHERE u.email = ?1 and password = ?2 and status='A'", nativeQuery = true)
	  Usuario findDataByLogin(String nombre, String password);
	 
	 
	
}
