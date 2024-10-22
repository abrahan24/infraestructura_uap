package uap.edu.bo.infraestructura.Model.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uap.edu.bo.infraestructura.Model.Dao.PersonaDao;
import uap.edu.bo.infraestructura.Model.Entity.Persona;
import uap.edu.bo.infraestructura.Model.Service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    private PersonaDao dao;

    @Override
    public List<Persona> findAll() {
        // TODO Auto-generated method stub
        return (List<Persona>) dao.findAll();
    }

    @Override
    public Persona findById(Long id) {
        // TODO Auto-generated method stub
        return dao.findById(id).orElse(null);
    }

    @Override
    public void save(Persona persona) {
        // TODO Auto-generated method stub
        dao.save(persona);
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        dao.deleteById(id);
    }
    
}
