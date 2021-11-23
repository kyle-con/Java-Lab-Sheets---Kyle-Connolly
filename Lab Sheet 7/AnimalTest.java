public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog.toString());
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat.toString());
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();

		Animal cow = new Cow("Daisy", 3, 'F');
		System.out.println(cow.toString());
		cow.eat();
		cow.sleep();
		cow.makeSound();

		System.out.println();

		Vet V1 = new Vet("James");

		V1.Vaccinate(dog);

		System.out.println();

		V1.Vaccinate(cat);
	}
}
