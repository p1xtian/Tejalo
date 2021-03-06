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

import com.tejalo.entidades.Pedido;
import com.tejalo.entidades.Usuario;
import com.tejalo.repositorio.PedidoRepositorio;

@RestController
@RequestMapping("/api")
public class PedidoController {

	@Autowired
	private PedidoRepositorio pedidoRepositorio;
	
	@GetMapping("/pedidos")
	public List<Pedido> obtenerPedidos(){		
		return(List<Pedido>) pedidoRepositorio.findAll();
	}

	@PostMapping("/registrarPedido")
	public Pedido registrarUSuario(@Valid @RequestBody Pedido pedido) {

		return pedidoRepositorio.save(pedido);
	}
	
	
	
	@GetMapping("/pedido/{codigo}") 
	 public Pedido	obtenerPedidoById(@PathVariable(value = "codigo") Long codigo) {
		return pedidoRepositorio.findBycodigo(codigo);
	    }
	
	@PutMapping("/pedido/{codigo}")
	public Pedido actualizarPedido(@PathVariable(value = "codigo") Long codigo,
			@Valid @RequestBody Pedido pedidoDetalle) {
		
		Pedido pedido = pedidoRepositorio.findBycodigo(codigo);
		
		pedido.setPhoto(pedidoDetalle.getPhoto());
		pedido.setValidacion(pedidoDetalle.getValidacion());
		pedido.setEstado(pedidoDetalle.getEstado());
		Pedido updatedPedido = pedidoRepositorio.save(pedido);
		return updatedPedido;
	}
	
	
	
	
/*
	@GetMapping("/usuario/buscarDNI/{DNI}") 
	 public Usuario	 findDataByDNI(@PathVariable(value = "DNI") String DNI) {
	    return usuarioRepositorio.findDataByDNI(DNI);
	    }
	
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
