/*
 * Created by Gent Kastrati
 */

package gent.springframework.repositories;

import gent.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
