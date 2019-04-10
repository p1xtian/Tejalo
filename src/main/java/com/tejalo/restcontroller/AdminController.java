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
import com.tejalo.entidades.Usuario;
import com.tejalo.repositorio.AdminRepositorio;
import com.tejalo.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	private AdminRepositorio adminRepositorio;
	
	@GetMapping("/admins")
	public List<Admin> obtenerUsuarios(){		
		return(List<Admin>) adminRepositorio.findAll();
	}

	@PostMapping("/registerAdmin")
	public Admin registrarAdmin(@Valid @RequestBody Admin admin) {
		
		

		return adminRepositorio.save(admin);
	}
	
	@GetMapping("/admins/email/{email}") 
	 public Admin	 findByEmail(@PathVariable(value = "email") String email) {
	    return adminRepositorio.findByEmail(email);
	    }
	
	@GetMapping("/admins/ruc/{ruc}") 
	 public Admin	 findByRuc(@PathVariable(value = "ruc") String ruc) {
	    return adminRepositorio.findByRUC(ruc);
	    }
	
	
	
	//
	//@PutMapping("/updateAdmin/{codigo}")
	//public Admin actualizaAdmin(@PathVariable(value = "codigo") Long codigo,
	//		@Valid @RequestBody Admin adminDetalle) {
		
		//Admin admin = adminRepositorio.findById(codigo);
		
	//	Admin updatedAdmin = adminRepositorio.save(admin);
	//	return updatedAdmin;
		
	//}
	
}
