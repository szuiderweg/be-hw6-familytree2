class Pet
{
    private String name;
    private int age;
    private String species;
    private Person owner;

    public Pet(String name, int age, String species)//constructor without owner
    {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    // getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //no owner getter/setter here in this class. a pet is assigned to a person using the addPet-method in the class "Person" because pet ownership is a property of a person-object
}
