package ozcan.springframework.springpetclinic.service;

import ozcan.springframework.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    public Owner findByLastName(String lastName);

}
