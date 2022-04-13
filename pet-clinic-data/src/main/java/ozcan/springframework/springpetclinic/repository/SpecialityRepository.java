package ozcan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import ozcan.springframework.springpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
