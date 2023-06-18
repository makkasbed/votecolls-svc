package services;

import entities.Constituency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.ConstituencyRepo;

import java.util.List;

@Service
public class ConstituencyService {
    @Autowired
    ConstituencyRepo constituencyRepo;

    public Constituency save(Constituency c)
    {
        return constituencyRepo.save(c);
    }
    public List<Constituency> list(){
        return constituencyRepo.findAll();
    }
    public Constituency update(Integer id, Constituency c)
    {
        Constituency constituency = constituencyRepo.getById(id);
        if(constituency!=null){
            constituency.setName(c.getName());
            constituency.setRegion(c.getRegion());
            return constituencyRepo.save(constituency);
        }else{
            return null;
        }
    }
}
