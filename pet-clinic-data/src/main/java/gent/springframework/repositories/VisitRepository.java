/*
 * Created by Gent Kastrati
 */

package gent.springframework.repositories;

import gent.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
