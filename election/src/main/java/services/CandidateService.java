package services;

import entities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.CandidateRepo;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    CandidateRepo candidateRepo;

    public Candidate save(Candidate c){
        return candidateRepo.save(c);
    }
    public List<Candidate> list(){
        return candidateRepo.findAll();
    }
    public Candidate update(Integer id,Candidate c){
        Candidate candidate = candidateRepo.getById(id);
        if(candidate!=null){
            candidate.setName(c.getName());
            candidate.setPhoto(c.getPhoto());
            return candidateRepo.save(candidate);
        }else{
            return null;
        }
    }
}
