package Java_Interfaces;

public class Interfaces{
	public static void main(String[] args) {
		//polymorphism to refer to my Dog obj with
		// a Domesticated Type reference variable.
		Domesticated domesticatedThing = new Dog();
		//can't call the eat method from a Domesticated type reference variable
		//because eat() method isn't declared in the interface.
		domesticatedThing.doWork();
	}
}

interface Domesticated {
	public void doWork();
}

class Animal{
	public void eat() {
		System.out.println("I eat food");
	}
}
//both classes of Wolf and Dog have an overriding methods "eat"
class Wolf extends Animal{
	public void eat() {
		System.out.println("I eat fresh meat");
	}
}
//Dog class inherits from Animal and implements Domesticated
//Because dog implements the Domesticated interface, it also implements the doWork method
class Dog extends Animal implements Domesticated{
	public void eat() {
		System.out.println("I eat kibble");
	}
	public void doWork(){
		System.out.println("I perform a trick!");
	}
}
