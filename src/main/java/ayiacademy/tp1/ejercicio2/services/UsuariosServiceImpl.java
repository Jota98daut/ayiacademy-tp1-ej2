package ayiacademy.tp1.ejercicio2.services;

import ayiacademy.tp1.ejercicio2.persistence.entities.Usuario;
import ayiacademy.tp1.ejercicio2.persistence.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public boolean validatePassword(String nombre, String passwordUsuario) {
        List<Usuario> usuarios = usuariosRepository.findByNombre(nombre);
        return usuarios.stream().anyMatch(usuario -> usuario.getPasswordUsuario().equals(passwordUsuario));
    }
}
