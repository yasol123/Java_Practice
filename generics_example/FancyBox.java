package generics_example;

public class FancyBox<T> {
	private T contents; //whenever the letter T appears, it's replaced with that type.
	
	public FancyBox() {} //has a private reference variable of type T that points to the contained object.
	public FancyBox(T in) {
		this.contents = in;
	}
	//method "put", which sets the private variable to the passed in the
	//reference of typeT;
	public void put(T in) {
		this.contents = in;
	}
	//method "get", which returns the type T object stored in the private variable. 
	public T get() {
		return contents;
	}
}
