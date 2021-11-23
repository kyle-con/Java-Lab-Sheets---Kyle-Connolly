public class Cat extends Animal {

    public Cat(String name, int age, char gender) {
    
        super(name, age, gender);

    }

    @Override
    public void eat()
    {
        System.out.println("Cat is now chewing down some ham");
    }

    @Override
    public void sleep()
    {
        System.out.println("Cat is now peacefully sleeping.");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Cat is meowing and purring");

    }

    @Override
    public String toString() {
        return "Cat [name=" +super.getName()+ ", age=" + super.getAge()+ ". gender=" + super.getGender()+"]";
    }
    
}
