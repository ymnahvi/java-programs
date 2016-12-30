/* Starting the Hello World Java program */
public class HelloWorld{

	public static void main(String[] args){
	System.out.println("Hello World!");
	String X = "The is another line!";
	System.out.println(X);
	
	System.out.println(max(4,max(1,5)));
	
	drawTriangle(15);
	
	int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
	
	System.out.println("Max of numbers is "+max(numbers));
	
	}

	public static int max(int[] m){
		int Z = 0;
		for(i in m){
			if(m[i] > Z)
				Z=m[i];
		}
		return Z;
	}
	
	public static void drawTriangle(int N){
		for(int j=1; j<=N; j++){
			
			for(int i=1; i<=j; i++)
				{
				System.out.print("*");		
				}	
				System.out.print("\n");
		}
	}
	
}


