
/**
 * @author: Bhavin Patel
 * @Description: This Class Tester to test the program
 * @version 1.0  Jan-30-2015 Creating Tester Class with main method 
 * @version 2.0 Jan-30-2015 Create the object of the Hero class and
 *                    called the method of the Hero Class
 */

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a object of the Hero Class
		Hero bhavin = new Hero("Bhavin");
		
		//Call the metohd of the Hero Class
		bhavin.show();
		bhavin.fight();
	}
}
