package services;

import entities.PollDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.PollDetailRepo;

import java.util.List;

@Service
public class PollDetailService {
    @Autowired
    PollDetailRepo pollDetailRepo;

    public PollDetail save(PollDetail pd){
        return pollDetailRepo.save(pd);
    }
    public List<PollDetail> list(){
        return pollDetailRepo.findAll();
    }
    public PollDetail update(Integer id,PollDetail pd){
        PollDetail pollDetail = pollDetailRepo.getById(id);
        if(pollDetail!=null){
            pollDetail.setPollId(pd.getPollId());
            pollDetail.setCandidateId(pd.getCandidateId());
            pollDetail.setPartyId(pd.getPartyId());
            return pollDetailRepo.save(pollDetail);
        }else{
            return null;
        }
    }
}
