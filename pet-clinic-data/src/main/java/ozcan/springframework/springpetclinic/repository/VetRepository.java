package ozcan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springframework.springpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
