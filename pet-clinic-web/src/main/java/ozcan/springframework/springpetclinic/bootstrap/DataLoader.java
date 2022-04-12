package ozcan.springframework.springpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ozcan.springframework.springpetclinic.model.*;
import ozcan.springframework.springpetclinic.service.OwnerService;
import ozcan.springframework.springpetclinic.service.PetTypeService;
import ozcan.springframework.springpetclinic.service.SpecialityService;
import ozcan.springframework.springpetclinic.service.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    @Autowired  // This is not necessary, it's optional
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if(count==0) {
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);


        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Jackson");
        owner1.setAddress("123 Kebap St.");
        owner1.setCity("Yozgat");
        owner1.setTelephone("1231312");

        Pet micksPet = new Pet();
        micksPet.setName("doggy");
        micksPet.setPetType(savedDogPetType);
        micksPet.setBirthDate(LocalDate.now());
        micksPet.setOwner(owner1);
        owner1.getPets().add(micksPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Josemite");
        owner2.setLastName("Sam");
        owner2.setAddress("123 Doner St.");
        owner2.setCity("Urfa");
        owner2.setTelephone("567543453");

        Pet samsPet = new Pet();
        samsPet.setName("cuddy");
        samsPet.setPetType(savedCatPetType);
        samsPet.setBirthDate(LocalDate.now());
        samsPet.setOwner(owner2);
        owner2.getPets().add(samsPet);

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Samwise");
        vet1.setLastName("Gamgee");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Frodo");
        vet2.setLastName("Baggins");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded vets....");
    }
}
