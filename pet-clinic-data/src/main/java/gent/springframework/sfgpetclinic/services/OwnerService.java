
package gent.springframework.sfgpetclinic.services;
import gent.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner ,Long>{
    Owner findByLastName(String lastName);

}
