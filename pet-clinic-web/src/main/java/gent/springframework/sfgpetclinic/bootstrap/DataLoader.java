/*
 * Created by Gent Kastrati
 */

/*
 * Created by Gent Kastrati
 */

package gent.springframework.sfgpetclinic.bootstrap;

import gent.springframework.sfgpetclinic.model.Owner;
import gent.springframework.sfgpetclinic.model.PetType;
import gent.springframework.sfgpetclinic.model.Vet;
import gent.springframework.sfgpetclinic.services.OwnerService;
import gent.springframework.sfgpetclinic.services.PetTypeService;
import gent.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setPetName("dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setPetName("Cat");
        PetType savedCatType = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Gent");
        owner1.setLastName("Kastrati");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Gzim");
        owner2.setLastName("Gashi");
        ownerService.save(owner2);

        System.out.println("Loading owners...");


        Vet vet1 = new Vet();
        vet1.setFirstName("Rinor");
        vet1.setLastName("Kastrati");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Arti");
        vet2.setLastName("Berisha");
        vetService.save(vet2);

        System.out.println("Loading vets...");
    }
}
