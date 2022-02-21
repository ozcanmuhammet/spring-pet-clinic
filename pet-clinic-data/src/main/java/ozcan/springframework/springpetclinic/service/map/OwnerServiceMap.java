package ozcan.springframework.springpetclinic.service.map;

import org.springframework.stereotype.Service;
import ozcan.springframework.springpetclinic.model.Owner;
import ozcan.springframework.springpetclinic.service.CrudService;
import ozcan.springframework.springpetclinic.service.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }





}
