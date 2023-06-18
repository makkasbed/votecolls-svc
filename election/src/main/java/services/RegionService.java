package services;

import entities.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repos.RegionRepo;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    RegionRepo regionRepo;

    public Region save(Region r)
    {
        return regionRepo.save(r);
    }
    public List<Region> list(){
        return regionRepo.findAll();
    }
    public Region update(Integer id,Region r)
    {
        Region region = regionRepo.getById(id);
        if(region!=null){
            region.setName(r.getName());
            return  regionRepo.save(region);
        }else{
            return null;
        }
    }
}
