package uap.edu.bo.infraestructura.Model.Service;

import java.util.List;

import uap.edu.bo.infraestructura.Model.Entity.Persona;

public interface IPersonaService {
    List<Persona> findAll();
    Persona findById(Long id);
    void save(Persona persona);
    void deleteById(Long id);
}
