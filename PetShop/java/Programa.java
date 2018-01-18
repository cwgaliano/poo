public class Programa {
	public static void main(String args[]){
		Dog myDog = new Dog();
		
		myDog.name = "lulu";
		myDog.race = "coquer";
		myDog.age = 4;
		myDog.weigth = 20;
		
		myDog.bark();
		
		System.out.println(myDog.name);
		System.out.println(myDog.race);
		System.out.println(myDog.age);
		System.out.println(myDog.weigth);
		
	}
}
		
