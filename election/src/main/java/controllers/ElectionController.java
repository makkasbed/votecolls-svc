package controllers;

import entities.Election;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.ElectionService;

import java.util.List;

@RestController
@RequestMapping("api/v1/elections")
public class ElectionController {
    @Autowired
    ElectionService electionService;

    @PostMapping(produces = "application/json",consumes = "application/json")
    public Election submit(@RequestBody Election e)
    {
        return electionService.save(e);
    }
    @GetMapping(produces = "application/json")
    public List<Election> list()
    {
        return electionService.list();
    }
    @PutMapping(value="/{id}",produces = "application/json",consumes = "application/json")
    public Election submit(@PathVariable Integer id,@RequestBody Election e)
    {
        return electionService.update(id,e);
    }
}
