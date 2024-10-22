package uap.edu.bo.infraestructura.Model.Dao;

import org.springframework.data.repository.CrudRepository;

import uap.edu.bo.infraestructura.Model.Entity.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {
    
}
