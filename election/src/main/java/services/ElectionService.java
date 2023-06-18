package services;

import entities.Election;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.ElectionRepo;

import java.util.List;

@Service
public class ElectionService {
    @Autowired
    ElectionRepo electionRepo;
    
    public Election save(Election e)
    {
        return electionRepo.save(e);
    }
    public List<Election> list(){
        return electionRepo.findAll();
    }
    public Election update(Integer id,Election e){
        Election election = electionRepo.getById(id);
        if(election!=null){
            election.setName(e.getName());
            election.setDescription(e.getDescription());
            election.setStatus(e.getStatus());

            return electionRepo.save(election);
        }else{
            return null;
        }
    }
}
