package Dog;//PAGE 62

public class Dog {
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		//Now make a Dog array
		Dog[] myDogs = new Dog[3];
		//And put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		//Now access the Dogs using the array
		//References
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		//Hmmmm... what is MyDogs[2] name?
		System.out.print("last dog's name is ");;
		System.out.println(myDogs[2].name);
		//Now loop through the array
		//and tell all dogs to bark
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}
	public void bark() {
		System.out.println(name + " says Ruff!");
	}
	public void eat() { }
	public void chaseCat() { }
}