/*
 * Created by Gent Kastrati
 */

package gent.springframework.sfgpetclinic.repositories;

import gent.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
    Vet findByLastName(String lastName);
}
