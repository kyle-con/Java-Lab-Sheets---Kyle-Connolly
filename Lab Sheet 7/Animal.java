public class Animal {

    private String name = "";
    private int age = 0;
    private char gender;

    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }    

    public void eat()
    {
        System.out.println("Animal is now eating");

    }

    public void sleep()
    {
        System.out.println("Animal is now Sleeping");
    }

    public void makeSound()
    {
        System.out.println("Animal is making random noise");

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", gender='" + getGender() + "'" +
            "}";
    }
    
    

}
