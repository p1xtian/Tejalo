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
import com.tejalo.entidades.Reserve;
import com.tejalo.repositorio.AdminRepositorio;
import com.tejalo.repositorio.ClienteRepositorio;
import com.tejalo.repositorio.RestaurantRepositorio;
import com.tejalo.repositorio.ReserveRepositorio;

@RestController
@RequestMapping("/api")
public class ReserveController {

	@Autowired
	private ReserveRepositorio reserveRepositorio;
	
	@GetMapping("/reserves")
	public List<Reserve> obtenerRestaurantes(){		
		return(List<Reserve>) reserveRepositorio.findAll();
	}

	@PostMapping("/registerReserve")
	public Reserve registrarReserve(@Valid @RequestBody Reserve reserve) {
		
		

		return reserveRepositorio.save(reserve);
	}
	
	@GetMapping("/reserves/{email}")
	public List<Reserve> obtenerReserveByEmail(@PathVariable(value = "email") String email) {
		return reserveRepositorio.findDataByEmail(email);
	}
	
	@GetMapping("/reserves/ruc/{ruc}")
	public List<Reserve> obtenerReserveByRUC(@PathVariable(value = "ruc") String ruc) {
		return reserveRepositorio.findDataByRUC(ruc);
	}
	
	
	
	
	
	
}
