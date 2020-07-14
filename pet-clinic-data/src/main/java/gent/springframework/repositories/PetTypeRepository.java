/*
 * Created by Gent Kastrati
 */

package gent.springframework.repositories;

import gent.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
