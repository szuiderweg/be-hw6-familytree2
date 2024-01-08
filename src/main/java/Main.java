
public class Main
{
    public static void main(String[] args)
    {
        //here is an example family created
        Person eva = new Person("Eva","Bos",72,"vrouw");//grandmother
        eva.setMiddleName("Marie");
        Pet snuffie = new Pet("Snuffie",3,"konijn");
        eva.addPet(snuffie);//grandmother has a pet rabbit

        Person jan =  new Person("Jan","Tinus","Bos","man",75 );//grandfather

        Person kees = new Person("Kees","Bos",47,"man");
        //Kees is the eldest son of Eva and Jan
        kees.addFamilyMember(kees, eva, jan);




        Person karin = new Person("Karin","de Vries",45,"vrouw");//wife of Kees


    }








}
