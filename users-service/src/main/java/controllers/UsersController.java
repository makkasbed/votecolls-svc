package controllers;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.UsersService;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<?> createUser(User u){
        return new ResponseEntity(usersService.save(u), HttpStatus.CREATED);
    }
    @GetMapping(produces = "application/json", value = "/{id}")
    public ResponseEntity<?> list(@PathVariable("id") Integer id){
        return new ResponseEntity(usersService.findById(id), HttpStatus.OK);
    }
    @GetMapping(produces = "application/json")
    public ResponseEntity<?> listAll(){
        return new ResponseEntity(usersService.list(),HttpStatus.OK);
    }
    @PutMapping(produces = "application/json", value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,User usr){
        return new ResponseEntity(usersService.update(id,usr),HttpStatus.OK);
    }
    @DeleteMapping(produces = "application/json", value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Integer id){
        return new ResponseEntity(usersService.delete(id),HttpStatus.NO_CONTENT);
    }
}
