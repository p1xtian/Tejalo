package com.tejalo.restcontroller;


import java.util.List;

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

import com.tejalo.entidades.Cliente;
import com.tejalo.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@GetMapping("/clientes")
	public List<Cliente> obtenerUsuarios(){		
		return(List<Cliente>) clienteRepositorio.findAll();
	}

	@PostMapping("/registrarCliente")
	public Cliente registrarUSuario(@Valid @RequestBody Cliente cliente) {

		return clienteRepositorio.save(cliente);
	}
	
	
	/*
	@GetMapping("/cliente/{codigo}") 
	 public Cliente	obtenerClienteById(@PathVariable(value = "codigo") Long codigo) {
		return clienteRepositorio.findBycodigo(codigo);
	    }
	*/

	@GetMapping("/cliente/buscar/{razon}") 
	 public Cliente	 findDataByRazon(@PathVariable(value = "razon") String razon) {
	    return clienteRepositorio.findDataByRazon(razon);
	    }
	/*
	@GetMapping("/usuario/buscaremail/{email}") 
	 public Usuario	 findDataByemail(@PathVariable(value = "email") String email) {
	    return usuarioRepositorio.findDataByemail(email);
	    }
	
	@PutMapping("/usuario/{codigo}")
	public Usuario actualizarProducto(@PathVariable(value = "codigo") Long codigo,
			@Valid @RequestBody Usuario usuarioDetalle) {
		
		Usuario usuario = usuarioRepositorio.findBycodigo(codigo);
		
		usuario.setLastName(usuarioDetalle.getLastName());
		usuario.setFirstName(usuarioDetalle.getFirstName());
		usuario.setPhone(usuarioDetalle.getPhone());
		Usuario updatedUsuario = usuarioRepositorio.save(usuario);
		return updatedUsuario;
	}
	
	
	@PutMapping("/usuario/eliminar/{codigo}")
	public Usuario actualizarestadoProducto(@PathVariable(value = "codigo") Long codigo,
			@Valid @RequestBody Usuario usuarioDetalle) {
		
		Usuario usuario = usuarioRepositorio.findBycodigo(codigo);
		
		usuario.setStatus("I");		

		Usuario updatedUsuario = usuarioRepositorio.save(usuario);
		return updatedUsuario;
	}	
	
	
	@DeleteMapping("/usuario/{id}")
	public ResponseEntity<?> eliminarUsuario(@PathVariable(value = "id") Long codigo) {
	    Usuario usuario = usuarioRepositorio.findBycodigo(codigo);	            

	    usuarioRepositorio.deleteById(codigo);

	    return ResponseEntity.ok().build();
	}
	*/
}
