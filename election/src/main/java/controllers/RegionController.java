package controllers;

import entities.Region;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.RegionService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/regions")
public class RegionController {
    @Autowired
    RegionService regionService;

    @PostMapping(produces = "application/json",consumes = "application/json")
    public Region submit(@RequestBody Region region)
    {
        return regionService.save(region);
    }
    @GetMapping(produces = "application/json",consumes = "application/json")
    public List<Region> list(){
        return regionService.list();
    }
    @PutMapping(value="/{id}",produces = "application/json",consumes = "application/json")
    public Region update(@PathVariable Integer id,@RequestBody Region region)
    {
        return regionService.update(id,region);
    }
}
