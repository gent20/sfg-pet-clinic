package gent.springframework.sfgpetclinic.services;

import gent.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public class PetService {


    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll;
}
