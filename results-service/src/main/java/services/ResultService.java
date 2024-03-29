package services;

import entities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.ResultsRepo;

import java.util.List;

@Service
public class ResultService {
    @Autowired
    ResultsRepo resultsRepo;

    public Result add(Result r){
        return  resultsRepo.save(r);
    }

    public List<Result> list(Integer id){
        return  resultsRepo.findByElectionId(id);
    }
}
