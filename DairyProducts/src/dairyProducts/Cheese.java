package dairyProducts;

public class Cheese extends DairyProduct {
		
	// CONSTANT DECLARATIONS
	
	
	//Data element variables – identification and nutrition info
	private String type; // variable to store name of dairyProduct object
	private String color; // variable to store numeric serving size of dairyProduct object (ounces)

	//Methods 
	/** the Cheese Method
	 * Purpose: default method to create Cheese object with default values
	 * @param none
	 * @return none
	 */
	public Cheese() { // default Cheese object constructor no parameters
		this.type = "Cheddar"; // default cheese type
		this.color = "Yellow"; // default cheese color
	}
	
	/** the Cheese Method
	 * Purpose: custom Cheese dairy product object method to create object with parameter values
	 * @param none
	 * @return none
	 */
	public Cheese(String name, double servingSize, double numberOfServings, double caloriesPerServing, boolean vitaminA,
			boolean vitaminC, boolean calcium, double fat, String type, String color) {
		super(name, servingSize, numberOfServings, caloriesPerServing, vitaminA, vitaminC, calcium, fat); // invoke custom parent object method with parameters
		this.type = type; // set type to user specified type parameter
		this.color = color; // set color to user specified color parameter
	}
	
	/** the getProductInfo Method
	 * Purpose: getter method to return the information of this dairy product object
	 * @param none
	 * @return Full details on product including name, number of servings, serving size and nutritional value
	 */
	@Override // polymorphism - this method overrides the parent class method of the same name
	public String getProductInfo() { // string method to display identification and nutrition of this object
		String info = super.getProductInfo(); // instantiate String variable to hold our cheese data, include parent string
		info += "Product type = Cheese \n"; // indicate to the user that this is a cheese product type
		info += "Cheese type = " + this.getType()  + "\n"; // list type of cheese and move to next line
		info += "Color = " + this.getColor()  + "\n"; // list cheese color and move to next line
		return info;
	}

	/** the getType Method
	 * Purpose: getter method to return the cheese type  
	 * @param none
	 * @return Cheese type
	 */
	public String getType() { // getter method to return cheese type
		return this.type; // return type data element for this cheese product
	}
	
	/** the setType Method
	 * Purpose: setter method to set the cheese type for this cheese product  
	 * @param String type
	 * @return none
	 */
	public void setType (String type) { // setter method to set cheese type
		this.type = type; // set type data element for this product to the user specified type parameter
	}
	
	/** the getColor Method
	 * Purpose: getter method to return the cheese color  
	 * @param none
	 * @return Cheese color
	 */
	public String getColor() { // getter method to return cheese color
		return this.color; // return color data element for this cheese product
	}
	
	/** the setColor Method
	 * Purpose: setter method to set the cheese color for this cheese product  
	 * @param String color
	 * @return none
	 */
	public void setColor (String color) { // setter method to set cheese type
		this.color = color; // set color data element for this product to the user specified type parameter
	}
		
}
//Cheese class written by Stephen Sturdevant