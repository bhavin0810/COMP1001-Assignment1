
/**
 * @author: Bhavin Patel
 * @Description: Implementation Of the Hero Class with necessary properties and methods
 * @version 1.0  Jan-30-2015 Creating the Hero Class with necessary Properties and constructor
 * 
 *  */
public class Hero {
	
	//Private Properties-----------
	private int strength;
	private int speed;
	private int health;
	public String name;
	

	/**
     * Constructor to create objects of class Hero
     * @param name The name of the Hero
     */
	public Hero(String name){
		this.name = name;
	}
}
