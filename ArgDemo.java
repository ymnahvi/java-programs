/* Class to demonstrate how args work 
@author Yawar Nahvi*/
public class ArgDemo{
	
	public static void main(String[] args){
		int index = 0;
		int sum = 0;
		//System.out.println(args[0]);
		
		while(index < args.length){
		//System.out.println(args[index]);
		sum = sum + Integer.parseInt(args[index]);
		index++;		
		}
		System.out.println(sum);
	}
	
}

