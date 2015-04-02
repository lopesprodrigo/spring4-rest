package me.lopesprodrigo.rest.controller;

import me.lopesprodrigo.rest.domain.Usuario;
import me.lopesprodrigo.rest.domain.Usuario.Sexo;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {
	
	private static Logger log = Logger.getLogger(UsuarioRestController.class);

	@RequestMapping(value="/usuario", method=RequestMethod.GET, 
			produces = {"application/json"})
	public Usuario getUsuario() {
		log.debug("Web Service Rest que devolve um usuario JSON...");
		
		Usuario usuario = new Usuario();
		usuario.setId(1l);
		usuario.setNome("Rodrigo de Paula lopes");
		usuario.setSexo(Sexo.MASCULINO);
		
		return usuario;
	}
	
	@RequestMapping(value="/usuario/salvar", method=RequestMethod.POST, 
			consumes = {"application/json"}, produces = {"application/json"})
	public void setUsuario(@RequestBody Usuario usuario) {
		log.debug("Usuario recebido via Web Service Rest: " + usuario);
	}
	
}