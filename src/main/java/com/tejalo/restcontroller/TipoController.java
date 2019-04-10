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
import com.tejalo.entidades.Tipos;
import com.tejalo.entidades.Usuario;
import com.tejalo.repositorio.AdminRepositorio;
import com.tejalo.repositorio.ClienteRepositorio;
import com.tejalo.repositorio.TipoRepositorio;

@RestController
@RequestMapping("/api")
public class TipoController {

	@Autowired
	private TipoRepositorio tipoRepositorio;
	
	@GetMapping("/tipos")
	public List<Tipos> obtenerTipos(){		
		return(List<Tipos>) tipoRepositorio.findAll();
	}

	
}
