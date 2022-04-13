package ozcan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springframework.springpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
