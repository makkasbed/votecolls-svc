package controllers;

import entities.PollingStation;
import entities.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.PollingStationService;

import java.util.List;

@RestController
@RequestMapping("api/v1/stations")
public class PollingStationController {
    @Autowired
    PollingStationService pollingStationService;

    @PostMapping(produces = "application/json",consumes = "application/json")
    public PollingStation submit(@RequestBody PollingStation pollingStation)
    {
        return pollingStationService.save(pollingStation);
    }
    @PutMapping(value="/{id}",produces = "application/json",consumes = "application/json")
    public PollingStation update(@PathVariable Integer id,@RequestBody PollingStation pollingStation)
    {
        return pollingStationService.update(id,pollingStation);
    }
    @GetMapping(produces = "application/json",consumes = "application/json")
    public List<PollingStation> list()
    {
        return pollingStationService.list();
    }
}
