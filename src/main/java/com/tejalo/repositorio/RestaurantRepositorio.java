package com.tejalo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tejalo.entidades.Admin;
import com.tejalo.entidades.Cliente;
import com.tejalo.entidades.Restaurant;
import com.tejalo.entidades.Usuario;

public interface RestaurantRepositorio extends CrudRepository<Restaurant, Long>{

	Restaurant findBycodigo(Long codigo);
	
	
}
