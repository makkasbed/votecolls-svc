package controllers;

import entities.Candidate;
import entities.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repos.PollRepo;
import services.PollService;

import java.util.List;

@RestController
@RequestMapping("api/v1/polls")
public class PollController {
    @Autowired
    PollService pollService;

    @PostMapping(produces = "application/json",consumes = "application/json")
    public Poll submit(@RequestBody Poll p){
        return pollService.save(p);
    }
    @GetMapping(produces = "application/json",consumes = "application/json")
    public List<Poll> list(){
        return pollService.list();
    }
    @GetMapping(value="/{id}/election",produces = "application/json",consumes = "application/json")
    public List<Poll> listElection(@PathVariable Integer id){
        return pollService.findByElectionId(id);
    }
    @GetMapping(value="/{id}/constituency",produces = "application/json",consumes = "application/json")
    public List<Poll> listConstituency(@PathVariable Integer id){
        return pollService.findByConstituencyId(id);
    }

}
