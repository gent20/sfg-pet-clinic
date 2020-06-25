
package gent.springframework.sfgpetclinic.services;

import gent.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet , Long>{

    Vet findByLastName(String lastName);
}
