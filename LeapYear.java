/* A class to check if the Year is Leap
 * @author Yawar Nahvi */
  
public class LeapYear{
	
	public static void main(String[] args){
		
		int num = Integer.parseInt(args[0]);
		String leap = " is a Leap Year";
		String notleap = " is not a Leap Year";
		
		if(num % 400 == 0){
			System.out.println(num+leap);
		} else if((num % 4 == 0)&&(num % 100 != 0)){
			System.out.println(num+leap);
		} else {			
			System.out.println(num+notleap);
		}
		
	}
	
}