package uap.edu.bo.infraestructura.Model.Dao;

import org.springframework.data.repository.CrudRepository;

import uap.edu.bo.infraestructura.Model.Entity.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    
}
