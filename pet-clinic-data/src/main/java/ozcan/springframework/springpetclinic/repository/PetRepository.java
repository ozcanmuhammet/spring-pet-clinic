package ozcan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springframework.springpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
