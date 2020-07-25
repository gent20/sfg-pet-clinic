/*
 * Created by Gent Kastrati
 */

/*
 * Created by Gent Kastrati
 */

package gent.springframework.sfgpetclinic.bootstrap;

import gent.springframework.sfgpetclinic.model.*;
import gent.springframework.sfgpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }


    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);


        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Gent");
        owner1.setLastName("Kastrati");
        owner1.setCity("Prishtina");
        owner1.setAddress("Bregu i Diellit");
        owner1.setTelephone("0449499");

        Pet gentsPet = new Pet();
        gentsPet.setPetType(savedDogType);
        gentsPet.setOwner(owner1);
        gentsPet.setBirthday(LocalDate.now());
        gentsPet.setName("Shaki");
        owner1.getPets().add(gentsPet);

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Gzim");
        owner2.setLastName("Gashi");
        owner2.setCity("Prishtina");
        owner2.setAddress("Dardania");
        owner2.setTelephone("0449399");

        Pet gzimsPet = new Pet();
        gzimsPet.setPetType(savedCatType);
        gzimsPet.setOwner(owner2);
        gzimsPet.setBirthday(LocalDate.now());
        gzimsPet.setName("fiona");
        owner2.getPets().add(gzimsPet);


        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(gzimsPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);

        System.out.println("Loading owners...");


        Vet vet1 = new Vet();
        vet1.setFirstName("Rinor");
        vet1.setLastName("Kastrati");
        vet1.getSpecialties().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Arti");
        vet2.setLastName("Berisha");
        vetService.save(vet2);
        vet2.getSpecialties().add(savedDentistry);

        System.out.println("Loading vets...");
    }
}
