import java.util.ArrayList;
import java.util.List;

public class Person
{// idee om erachter te komen hoe final toe te passen: zie uitwerking pokemon uitwerking op Github, bv hier nuttig om ouders in te stellen en kinderen
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;// todo niet zeker of de lists van siblings uit persons moet bestaan, kan je op meerdere plekken naar dezelfde person verwijzen? ALs het niet lukt met List<Person>, dan met List <String>
    private List<Person> children;
    private List<Pet> pets;
    // ======= constructors =====================.

    public Person(String name, String lastName, int age, String sex)//constructor for a basic person without any relations to start the family tree with.
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
    }

    public Person(String name, String middleName, String lastName, String sex, int age)//constructor that also includes sex, age and parents. Siblings, children and pets are added during or after the construction of a person
    {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
    }

    //method to update the direct family members (child itself, parent and siblings) when a new child is added to the family
    public void addFamilyMember(Person child, Person mother, Person father)
    {
        //fill siblings-list of the child  with the mother's other children
        if(!mother.children.isEmpty())
        {
            for(Person sibling : mother.children)
            {
                child.addSibling(sibling);
            }
        }



        //todo fill siblings-list from the father's list of children (in case of half-siblings)




        //update siblings list of the siblings with the new child

        //add parents to child
        child.addParents(mother,father);
        //child to parents
        mother.addChild(child);
        father.addChild(child);

    }

    // ======= add family members methods =====================.

    private void addParents(Person mother, Person father)
    {
        //assign this person two parents
        this.mother = mother;
        this.father = father;//add this person to each parent as a child
    }

    public void addChild(Person child)
    {
        this.children.add(child);
    }

    public void addPet(Pet pet)
    {
        this.pets.add(pet);
    }


    public void addSibling(Person sibling)
    {
        this.siblings.add(sibling);
    }


    //getters for relatives
    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    // ======= getters and setters for the other properties=====================.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
