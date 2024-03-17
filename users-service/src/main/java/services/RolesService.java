package services;

import entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.RoleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RolesService {
    @Autowired
    RoleRepository repository;

    public Role save(Role r){
        return repository.save(r);
    }
    public Optional<Role> findById(Integer id){
        return repository.findById(id).or(null);
    }
    public List<Role> roles(){
        return repository.findAll();
    }
    public Role update(Integer id, Role r){
        Role role = repository.findById(id).orElse(new Role());
        if(role!=null){
            role.setDescription(r.getDescription());
            role.setName(r.getName());
            role.setStatus(r.getStatus());
            role.setUpdatedAt(r.getUpdatedAt());

            return repository.save(role);
        }else{
            return null;
        }
    }

    public Role delete(Integer id){
        Role role = repository.findById(id).orElse(new Role());
        if(role!=null){
            role.setStatus("Deleted");
            return repository.save(role);
        }else{
            return null;
        }
    }
}
