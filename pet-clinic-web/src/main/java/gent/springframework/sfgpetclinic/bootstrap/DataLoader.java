/*
 * Created by Gent Kastrati
 */

/*
 * Created by Gent Kastrati
 */

package gent.springframework.sfgpetclinic.bootstrap;

import gent.springframework.sfgpetclinic.model.Owner;
import gent.springframework.sfgpetclinic.model.Vet;
import gent.springframework.sfgpetclinic.services.OwnerService;
import gent.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Gent");
        owner1.setLastName("Kastrati");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Gzim");
        owner1.setLastName("Gashi");
        ownerService.save(owner2);

        System.out.println("Loading owners...");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Rinor");
        vet1.setLastName("Kastrati");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Arti");
        vet2.setLastName("Berisha");
        vetService.save(vet2);

        System.out.println("Loading vets...");
    }
}
