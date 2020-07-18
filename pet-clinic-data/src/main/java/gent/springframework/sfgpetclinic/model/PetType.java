package gent.springframework.sfgpetclinic.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    @Column(name = "pet_name")
    private String petName;22

}
