public class Dog extends Animal {

    public Dog(String name, int age, char gender) {
    
        super(name, age, gender);

    }

    @Override
    public void eat()
    {
        System.out.println("Dog is chomping down on some dog food");
    }

    @Override
    public void sleep()
    {
        System.out.println("Dog is completely asleep");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Dog is barking at the post man");

    }

    @Override
    public String toString() {
        return "Dog [name=" +super.getName()+ ", age=" + super.getAge()+ ". gender=" + super.getGender()+"]";
    }

}