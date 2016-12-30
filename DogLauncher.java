/* This class DOgLauncher tests the main class Dog */
public class DogLauncher{
	public static void main(String[] args){
		Dog Tess;				//Declaration
		new Dog(5);				//Instantiation
		Dog Maya = new Dog(20); 
		Tess = new Dog(80); 	//Assignment
		Dog Yapster = new Dog(5);

		Maya.MakeNoise();		//Invocation of Dog's MakeNoise Method
		Tess.MakeNoise();		//Tess is a member of Dog Class
		Dog.MaxDog(Yapster,Maya).MakeNoise();
	}
	
}