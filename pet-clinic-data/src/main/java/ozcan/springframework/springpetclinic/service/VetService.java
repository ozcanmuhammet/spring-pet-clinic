package ozcan.springframework.springpetclinic.service;

import ozcan.springframework.springpetclinic.model.Pet;
import ozcan.springframework.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
