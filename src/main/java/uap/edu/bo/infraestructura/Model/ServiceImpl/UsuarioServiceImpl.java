package uap.edu.bo.infraestructura.Model.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uap.edu.bo.infraestructura.Model.Dao.UsuarioDao;
import uap.edu.bo.infraestructura.Model.Entity.Usuario;
import uap.edu.bo.infraestructura.Model.Service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private UsuarioDao dao;

    @Override
    public List<Usuario> findAll() {
        // TODO Auto-generated method stub
        return (List<Usuario>) dao.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        // TODO Auto-generated method stub
        return dao.findById(id).orElse(null);
    }

    @Override
    public void save(Usuario usuario) {
        // TODO Auto-generated method stub
        dao.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        dao.deleteById(id);
    }
    
}
