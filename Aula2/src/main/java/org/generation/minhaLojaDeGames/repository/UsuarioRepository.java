package org.generation.minhaLojaDeGames.repository;

import java.util.List;
import org.generation.minhaLojaDeGames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome); //consultar como fazer, pois não realizamos a relação

}
