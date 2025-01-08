
package com.portfolio.diego.Security.Service;

import com.portfolio.diego.Security.Entity.Rol;
import com.portfolio.diego.Security.Enums.RolNombre;
import com.portfolio.diego.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolnombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
        }
        
         public void save(Rol  rol) {
                 irolRepository.save(rol);
         }
    

}
