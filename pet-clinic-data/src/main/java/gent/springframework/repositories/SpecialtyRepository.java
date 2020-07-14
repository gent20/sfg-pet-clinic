/*
 * Created by Gent Kastrati
 */

package gent.springframework.repositories;

import gent.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty,Long> {
}
