package services;

import entities.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.PartyRepo;

import java.util.List;

@Service
public class PartyService {
    @Autowired
    PartyRepo partyRepo;

    public Party submit(Party p)
    {
        return partyRepo.save(p);
    }
    public List<Party> list()
    {
        return partyRepo.findAll();
    }
    public Party update(Integer id,Party party){
        Party p = partyRepo.getById(id);
        if(p!=null){
            p.setLogo(party.getLogo());
            p.setName(party.getName());
            return partyRepo.save(p);
        }else{
            return null;
        }
    }
}
