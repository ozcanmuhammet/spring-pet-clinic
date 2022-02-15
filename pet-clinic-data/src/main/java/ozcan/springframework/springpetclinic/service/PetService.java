package ozcan.springframework.springpetclinic.service;

import ozcan.springframework.springpetclinic.model.Owner;
import ozcan.springframework.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByLastName(String lastName);

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
