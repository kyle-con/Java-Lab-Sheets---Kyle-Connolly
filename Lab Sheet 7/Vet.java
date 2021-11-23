public class Vet {
    
    String name;


    public Vet(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Vaccinate(Animal Animal){

        System.out.println(name + " is vaccinating.");
        System.out.println(Animal.getClass().getSimpleName()+" has been vaccinated.");
    }

}
