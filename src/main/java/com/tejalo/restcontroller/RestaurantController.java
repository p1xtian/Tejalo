package com.tejalo.restcontroller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tejalo.entidades.Admin;
import com.tejalo.entidades.Cliente;
import com.tejalo.entidades.Restaurant;
import com.tejalo.entidades.Usuario;
import com.tejalo.repositorio.AdminRepositorio;
import com.tejalo.repositorio.ClienteRepositorio;
import com.tejalo.repositorio.RestaurantRepositorio;

@RestController
@RequestMapping("/api")
public class RestaurantController {

	@Autowired
	private RestaurantRepositorio restaurantRepositorio;
	
	@GetMapping("/restaurantes")
	public List<Restaurant> obtenerRestaurantes(){		
		return(List<Restaurant>) restaurantRepositorio.findAll();
	}

	@PostMapping("/registerRestaurant")
	public Restaurant registrarRestaurant(@Valid @RequestBody Restaurant restaurant) {
		
		

		return restaurantRepositorio.save(restaurant);
	}
	
	
}
