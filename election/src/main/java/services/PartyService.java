package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.PartyRepo;

@Service
public class PartyService {
    @Autowired
    PartyRepo partyRepo;
}
