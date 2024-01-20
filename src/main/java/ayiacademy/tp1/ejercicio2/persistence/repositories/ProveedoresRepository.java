package ayiacademy.tp1.ejercicio2.persistence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ayiacademy.tp1.ejercicio2.persistence.entities.Proveedor;

@Repository
public interface ProveedoresRepository extends CrudRepository<Proveedor, Integer> {}
