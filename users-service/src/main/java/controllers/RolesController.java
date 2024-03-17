package controllers;

import entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.RolesService;

@RestController
@RequestMapping("api/v1/roles")
public class RolesController {
    @Autowired
    RolesService rolesService;

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<?> save(Role role){
        return new ResponseEntity(rolesService.save(role), HttpStatus.CREATED);
    }
    @GetMapping(produces = "application/json", value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable("id")Integer id){
        return new ResponseEntity(rolesService.findById(id),HttpStatus.OK);
    }
    @GetMapping(produces = "application/json")
    public ResponseEntity<?> listAll(){
        return new ResponseEntity(rolesService.roles(),HttpStatus.OK);
    }
    @PutMapping(produces = "application/json", value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Integer id,Role role){
        return new ResponseEntity(rolesService.update(id,role),HttpStatus.OK);
    }
    @DeleteMapping(produces = "application/json", value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Integer id){
        return new ResponseEntity(rolesService.delete(id),HttpStatus.NO_CONTENT);
    }
}
