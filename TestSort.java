/* Tests the Sort class 
 *@author Yawar Nahvi
 */
import org.junit.*;
 
public class TestSort{
	
	public static void testSort(){
		//HardCoded Test string
		String[] input = {"My", "name", "is", "Yawar", "Nahvi"};
		//Sort.sort(input);
		String[] expected = {"is", "My", "name", "Nahvi", "Yawar"};
		
		//Testing to check if expected value matches sorted value
		org.junit.Assert.assertArrayEquals(expected, input);
		
	}
	
	public static void main (String[] args) {
		testSort();
	}
	
}
 