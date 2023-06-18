package controllers;

import entities.Constituency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repos.ConstituencyRepo;
import services.ConstituencyService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/constituencies")
public class ConstituencyController {
    @Autowired
    ConstituencyService constituencyService;

    @PostMapping(produces = "application/json",consumes = "application/json")
    public Constituency submit(@RequestBody Constituency constituency){
        return constituencyService.save(constituency);
    }
    @GetMapping(produces = "application/json",consumes = "application/json")
    public List<Constituency> list(){
        return constituencyService.list();
    }
    @PutMapping(value="/{id}",produces = "application/json",consumes = "application/json")
    public Constituency update(@PathVariable Integer id,@RequestBody Constituency constituency){
        return constituencyService.update(id,constituency);
    }
}
