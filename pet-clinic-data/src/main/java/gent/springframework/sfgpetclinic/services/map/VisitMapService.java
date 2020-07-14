/*
 * Created by Gent Kastrati
 */

package gent.springframework.sfgpetclinic.services.map;

import gent.springframework.sfgpetclinic.model.Visit;
import gent.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
        public Visit save(Visit visit) {

        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
        || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }
         return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public void deleteById(Long aLong) {
        super.findById(aLong);
    }
}
