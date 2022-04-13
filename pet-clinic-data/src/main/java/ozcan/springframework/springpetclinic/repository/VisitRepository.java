package ozcan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springframework.springpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
