package ozcan.springframework.springpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ozcan.springframework.springpetclinic.model.Owner;
import ozcan.springframework.springpetclinic.model.PetType;
import ozcan.springframework.springpetclinic.model.Vet;
import ozcan.springframework.springpetclinic.service.OwnerService;
import ozcan.springframework.springpetclinic.service.PetTypeService;
import ozcan.springframework.springpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired  // This is not necessary, it's optional
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Jackson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Josemite");
        owner2.setLastName("Sam");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Samwise");
        vet1.setLastName("Gamgee");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Frodo");
        vet2.setLastName("Baggins");

        vetService.save(vet2);

        System.out.println("Loaded vets....");

    }
}
