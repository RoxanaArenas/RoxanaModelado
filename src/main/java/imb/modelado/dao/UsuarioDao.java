package imb.modelado.dao;

import java.util.List;

import imb.modelado.model.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {

	List<Usuario> obtenerUsuarios();
	
}
