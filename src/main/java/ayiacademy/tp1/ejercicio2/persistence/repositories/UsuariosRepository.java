package ayiacademy.tp1.ejercicio2.persistence.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ayiacademy.tp1.ejercicio2.persistence.entities.Usuario;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuario, Integer> {
    List<Usuario> findByNombre(String nombre);
}
