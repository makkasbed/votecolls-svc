package services;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.UserRepository;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    UserRepository userRepository;

    public User save(User u){
        return userRepository.save(u);
    }
    public User findById(Integer id){
        return userRepository.findById(id).orElse(new User());
    }
    public List<User> list(){
        return userRepository.findAll();
    }
    public User update(Integer id, User usr){
        User user = findById(id);
        if(user!=null){
            user.setUsername(usr.getUsername());
            user.setRoleId(usr.getRoleId());
            user.setStatus(usr.getStatus());

            return userRepository.save(user);
        }else{
            return null;
        }
    }
    public User delete(Integer id){
        User user = findById(id);
        if(user!=null){
            user.setStatus("Deleted");

            return userRepository.save(user);
        }else{
            return null;
        }
    }
}
