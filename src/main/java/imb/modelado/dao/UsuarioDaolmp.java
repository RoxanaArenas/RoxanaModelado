package imb.modelado.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import imb.modelado.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioDaolmp implements UsuarioDao{

	@PersistenceContext
	private EntityManager modelManager;
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> obtenerUsuarios() {
		String query="from Usuario";
		return modelManager.createQuery(query).getResultList();
	}
}