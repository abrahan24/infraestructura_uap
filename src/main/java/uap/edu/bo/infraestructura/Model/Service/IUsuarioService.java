package uap.edu.bo.infraestructura.Model.Service;

import java.util.List;

import uap.edu.bo.infraestructura.Model.Entity.Usuario;

public interface IUsuarioService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    void save(Usuario usuario);
    void deleteById(Long id);
}
