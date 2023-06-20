package controllers;

import entities.Poll;
import entities.PollDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repos.PollDetailRepo;
import services.PollDetailService;

import java.util.List;

@RestController
@RequestMapping("api/v1/polldetails")
public class PollDetailController {
    @Autowired
    PollDetailService pollDetailService;

    @PostMapping(produces = "application/json",consumes = "application/json")
    public PollDetail submit(@RequestBody PollDetail p){
        return pollDetailService.save(p);
    }
    @GetMapping(produces = "application/json",consumes = "application/json")
    public List<PollDetail> list(){
        return pollDetailService.list();
    }
    @PutMapping(value="/{id}",produces = "application/json",consumes = "application/json")
    public PollDetail update(@PathVariable Integer id,@RequestBody PollDetail p){
        return pollDetailService.update(id,p);
    }
}
