package generics_example;

public class FancyBoxTester {
	public static void main(String[] args) {
		FancyBox<String> myBox = new FancyBox<>();
		
		myBox.put("This string is in my FancyBox!");
		
		System.out.println(myBox.get());
		//if I use an integer in the FancyBox,error!
		//but if I instantiate the second FancyBox, it is okay to have an integer.
		FancyBox<Integer> newBox = new FancyBox<>(); // must have a diff variable. "newBox", not "myBox"
		newBox.put(1);
		
		System.out.println(newBox.get());
	}
}
