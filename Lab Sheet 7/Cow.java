public class Cow extends Animal {

    public Cow(String name, int age, char gender) {
    
        super(name, age, gender);

    }

    @Override
    public void eat()
    {
        System.out.println("Cow is grazing on some grass");
    }

    @Override
    public void sleep()
    {
        System.out.println("Cow has just passed out");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Cow is mooing loudly");

    }

    @Override
    public String toString() {
        return "Cow [name=" +super.getName()+ ", age=" + super.getAge()+ ". gender=" + super.getGender()+"]";
    }

}