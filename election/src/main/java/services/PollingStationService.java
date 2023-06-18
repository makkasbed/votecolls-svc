package services;

import entities.PollingStation;
import org.apache.tomcat.jni.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.PollingStationRepo;

import java.util.List;

@Service
public class PollingStationService {
    @Autowired
    PollingStationRepo pollingStationRepo;

    public PollingStation save(PollingStation p){
        return pollingStationRepo.save(p);
    }
    public List<PollingStation> list(){
        return pollingStationRepo.findAll();
    }
    public PollingStation update(Integer id,PollingStation p){
        PollingStation pollingStation=pollingStationRepo.getById(id);
        if(pollingStation!=null){
            pollingStation.setConstituencyId(p.getConstituencyId());
            pollingStation.setName(p.getName());
            return pollingStationRepo.save(pollingStation);
        }else{
            return null;
        }
    }
}
