package controllers;

import entities.Party;
import entities.PollingStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.PartyService;

import java.util.List;

@RestController
@RequestMapping("api/v1/parties")
public class PartyController {
    @Autowired
    PartyService partyService;

    @PostMapping(produces = "application/json",consumes = "application/json")
    public Party submit(@RequestBody Party party)
    {
        return partyService.submit(party);
    }
    @GetMapping(produces = "application/json",consumes = "application/json")
    public List<Party> list()
    {
        return partyService.list();
    }
    @PutMapping(value="/{id}",produces = "application/json",consumes = "application/json")
    public Party update(@PathVariable Integer id,@RequestBody Party party)
    {
        return partyService.update(id,party);
    }
}
