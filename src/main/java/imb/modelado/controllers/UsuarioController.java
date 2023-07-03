package imb.modelado.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imb.modelado.model.Usuario;

import imb.modelado.dao.UsuarioDao;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioDao  usuarioDao;
	
	@RequestMapping(value="api/usuario")
	public List<Usuario> getUsuario(){
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		return user;
	}
	
	
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "Hola";
	}
	
	@RequestMapping(value="persona")
	public List<String> listarPersonas() {
		
		return List.of("Roxana","Lucas","Arturo");
	}
	
	@RequestMapping(value="usuarios")
	public Usuario listarUsuario() {
		
		Usuario usuario=new Usuario();
		usuario.setNombre("Roxana");
		usuario.setApellido("Arenas");
		usuario.setEmail("roxana@gmail.com");
		usuario.setTelefono("2617044879");
		
		
		return usuario;
	}
	
	@RequestMapping(value="usuarios/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Lucas");
		usuario.setApellido("Arenas");
		usuario.setEmail("roxana@gmail.com");
		usuario.setTelefono("2617044929");
		
		
		return usuario;
	}
	
	@RequestMapping(value="usuarios/{id}")
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuario= new ArrayList<>();
		
		Usuario usuario1= new Usuario();
		usuario1.setId(2L);
		usuario1.setNombre("Arturo");
		usuario1.setApellido("Arenas");
		usuario1.setEmail("roxana@gmail.com");
		usuario1.setTelefono("2617044929");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(3L);
		usuario2.setNombre("Jennifer");
		usuario2.setApellido("Campos");
		usuario2.setEmail("jennifer@gmail.com");
		usuario2.setTelefono("2617044930");
		
		
		Usuario usuario3 = new Usuario();
		usuario3.setNombre("Ignacio");
		usuario3.setApellido("Meretta");
		usuario3.setEmail("ignamere@gmail.com");
		usuario3.setPassword("1222456");
		usuario3.setTelefono("261684445");
		usuario3.setId(3L);
		
		usuario.add(usuario1);
		usuario.add(usuario2);
		usuario.add(usuario3);
		
		
		return usuario;
	}

}
