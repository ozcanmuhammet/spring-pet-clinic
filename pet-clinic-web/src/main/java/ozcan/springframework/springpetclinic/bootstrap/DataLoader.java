package ozcan.springframework.springpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ozcan.springframework.springpetclinic.model.Owner;
import ozcan.springframework.springpetclinic.model.Vet;
import ozcan.springframework.springpetclinic.service.OwnerService;
import ozcan.springframework.springpetclinic.service.VetService;
import ozcan.springframework.springpetclinic.service.map.OwnerServiceMap;
import ozcan.springframework.springpetclinic.service.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired  // This is not necessary, it's optional
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Jackson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Josemite");
        owner2.setLastName("Sam");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Samwise");
        vet1.setLastName("Gamgee");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Frodo");
        vet2.setLastName("Baggins");

        vetService.save(vet2);

        System.out.println("Loaded vets....");

    }
}
