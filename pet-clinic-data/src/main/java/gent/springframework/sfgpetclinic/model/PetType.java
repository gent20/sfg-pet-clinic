package gent.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity{

    private String petName;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
