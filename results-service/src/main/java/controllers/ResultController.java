package controllers;

import entities.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.ResultService;

@RestController
@RequestMapping("api/v1/results")
public class ResultController {
    @Autowired
    ResultService resultService;

    @PostMapping(produces = "application/json",consumes = "application/json")
    public ResponseEntity<?> submit(@RequestBody Result result){

        return new ResponseEntity(resultService.add(result), HttpStatus.CREATED);
    }

    @GetMapping(value="/{id}",produces = "application/json", consumes = "application/json")
    public ResponseEntity<?> list(@PathVariable Integer id){
        return new ResponseEntity(resultService.list(id),HttpStatus.OK);
    }
}
