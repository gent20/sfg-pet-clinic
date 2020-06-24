
package gent.springframework.sfgpetclinic.services;

import gent.springframework.sfgpetclinic.model.Vet;

public class VetService extends CrudService<Vet , Long>{

    Vet findByLastName(String lastName);

}
