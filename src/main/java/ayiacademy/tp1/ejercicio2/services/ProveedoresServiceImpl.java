package ayiacademy.tp1.ejercicio2.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ayiacademy.tp1.ejercicio2.persistence.entities.Proveedor;
import ayiacademy.tp1.ejercicio2.persistence.repositories.ProveedoresRepository;

@Service
public class ProveedoresServiceImpl implements ProveedoresService {
    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @Override
    public Iterable<Proveedor> getAll() {
        return proveedoresRepository.findAll();
    }

    @Override
    public Optional<Proveedor> get(int idProveedor) {
        return proveedoresRepository.findById(idProveedor);
    }

    @Override
    public void save(Proveedor proveedor) {
        proveedoresRepository.save(proveedor);
    }

    @Override
    public void delete(int idProveedor) {
        proveedoresRepository.deleteById(idProveedor);
    }

}
