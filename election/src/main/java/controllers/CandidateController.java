package controllers;

import entities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CandidateService;

import java.util.List;

@RestController
@RequestMapping("api/v1/candidates")
public class CandidateController {
    @Autowired
    CandidateService candidateService;

    @PostMapping(produces = "application/json",consumes = "application/json")
    public Candidate submit(@RequestBody Candidate candidate){
        return candidateService.save(candidate);
    }
    @GetMapping(produces = "application/json")
    public List<Candidate> list(){
        return candidateService.list();
    }
    @PutMapping(value="/{id}",produces = "application/json")
    public Candidate update(@PathVariable Integer id,Candidate candidate){
        return candidateService.update(id,candidate);
    }
}
