public class Dog {
	public int size; //Instance Variable
	
	public Dog(int startSize){  //Constructor
		size=startSize;
	}
	
	public  void MakeNoise(){ //Non-Static Method
		if(size < 10){
			System.out.println("Horrific Yapping!");
		}
		else if(size < 30){
			System.out.println("Bark!");
		}
		else{
			System.out.println("Woofy woofity woof!");
		}
	
	}
	/* Returns the larger Dog */
	public static Dog MaxDog(Dog d1, Dog d2){
		if(d1.size > d2.size)
			return d1;
		else
			return d2;
		
	}

}
