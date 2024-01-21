package ayiacademy.tp1.ejercicio2.services;

import java.util.Optional;

import ayiacademy.tp1.ejercicio2.persistence.entities.Proveedor;

public interface ProveedoresService {
    Iterable<Proveedor> getAll();

    Optional<Proveedor> get(int idProveedor);

    void save(Proveedor proveedor);

    void delete(int idProveedor);
}
