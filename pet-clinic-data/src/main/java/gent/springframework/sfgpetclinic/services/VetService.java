package gent.springframework.sfgpetclinic.services;

import gent.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public class VetService {
    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll;
}
