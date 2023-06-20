package services;

import entities.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.PollRepo;

import java.util.List;

@Service
public class PollService {
    @Autowired
    PollRepo pollRepo;

    public Poll save(Poll p){
        return pollRepo.save(p);
    }
    public List<Poll> list(){
        return pollRepo.findAll();
    }
    public List<Poll> findByElectionId(Integer id){
        return pollRepo.findByElectionId(id);
    }
    public List<Poll> findByConstituencyId(Integer id){
        return pollRepo.findByConstituencyId(id);
    }
}
