package ozcan.springframework.springpetclinic.service.map;

import org.springframework.stereotype.Service;
import ozcan.springframework.springpetclinic.model.Vet;
import ozcan.springframework.springpetclinic.service.CrudService;
import ozcan.springframework.springpetclinic.service.VetService;

import javax.sql.rowset.CachedRowSet;
import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

}
