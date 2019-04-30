package com.tejalo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tejalo.entidades.Admin;
import com.tejalo.entidades.Cliente;
import com.tejalo.entidades.Restaurant;
import com.tejalo.entidades.Usuario;
import com.tejalo.entidades.Reserve;

public interface ReserveRepositorio extends CrudRepository<Reserve, Long>{

	Reserve findBycodigo(Long codigo);
	
	 @Query(value = "SELECT * FROM reserve u where  u.USERID = ?1 and activo ='true' order by codigo", nativeQuery = true)
	List<Reserve> findDataByEmail(String email);
	 
	 @Query(value = "SELECT * FROM reserve u where  u.ruc = ?1 and activo ='true' order by codigo", nativeQuery = true)
	List<Reserve> findDataByRUC(String ruc);
}
