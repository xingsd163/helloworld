package SocketOperations;

public class DogDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.bark();
		
		System.out.println(d.name);
		

	}

}

class Dog{
	public String name;
	private int weight;
	public void bark(){
		System.out.println("ÍôÍôÍô");
	}
}
