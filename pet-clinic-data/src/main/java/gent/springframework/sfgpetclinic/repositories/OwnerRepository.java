/*
 * Created by Gent Kastrati
 */

package gent.springframework.sfgpetclinic.repositories;

import gent.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
