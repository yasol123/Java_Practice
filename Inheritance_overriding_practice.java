package interitance_example;

public class MethodOverridingExample {
	public static void makeItTalk(Animal input) {
		input.speak();
	}
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Dog myDog = new Dog();
		System.out.println("Make the animal talk!");
		makeItTalk(myAnimal);
		System.out.println("Make the dog talk!");
		makeItTalk(myDog);
	}
}
class Animal{
	public void speak() {
		System.out.println("Generic Animal Sound");
	}
}
class Dog extends Animal{
	public void speak() {
		System.out.println("Woof! mung mung!");
	}
}
