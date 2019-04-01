// Source code for Final Project
// Name: Stephen Sturdevant
// Teammate: Chris Carpenter
// Class: CIT-260 Section 7
// Date: March 25, 2019
// derived Class Milk
package dairyProducts;

public class Milk extends DairyProduct {
		
	// CONSTANT DECLARATIONS
	
	
	//Data element variables – identification and nutrition info
	private String fatPercent; // variable to store fatPercent of Milk object
	private String source; // variable to store source of Milk (e.g. cow, goat, sheep, soy, almond, etc...)

	//Methods 
	/** the Milk Method
	 * Purpose: default method to create Milk object with default values
	 * @param none
	 * @return none
	 */
	public Milk() { // default Milk object constructor no parameters
		this.fatPercent = "1%"; // default Milk fat percent
		this.source = "Cow"; // default milk source
	}
	
	/** the Milk Method
	 * Purpose: custom Milk dairy product object method to create object with parameter values
	 * @param none
	 * @return none
	 */
	public Milk(String name, double servingSize, double numberOfServings, double caloriesPerServing, boolean vitaminA,
			boolean vitaminC, boolean calcium, double fat, String fatPercent, String source) {
		super(name, servingSize, numberOfServings, caloriesPerServing, vitaminA, vitaminC, calcium, fat); // invoke custom parent object method with parameters
		this.fatPercent = fatPercent; // set fatPercent to user specified fatPercent parameter
		this.source = source; // set source to user specified source parameter
	}
	
	/** the getProductInfo Method
	 * Purpose: getter method to return the information of this Milk dairy product object
	 * @param none
	 * @return Full details on product including name, number of servings, serving size and nutritional value
	 */
	@Override // polymorphism - this method overrides the parent class method of the same name
	public String getProductInfo() { // string method to display identification and nutrition of this object
		String info = super.getProductInfo(); // instantiate String variable to hold our Milk data, include parent string
		info += "Product type = Milk \n"; // indicate to the user that this is a Milk product type
		info += "Milk fat percentage = " + this.getFatPercent()  + "\n"; // list Milk fat percent and move to next line
		info += "Source = " + this.getSource()  + "\n"; // list Milk source and move to next line
		return info; // return info variable containing both parent class details and child class details
	}

	/** the getFatPercent Method
	 * Purpose: getter method to return the milk fat percent  
	 * @param none
	 * @return Milk fat percent
	 */
	public String getFatPercent() { // getter method to return Milk fat percent
		return this.fatPercent; // return fatPercent data element for this Milk product
	}
	
	/** the setFatPercent Method
	 * Purpose: setter method to set the fat percent for this milk product  
	 * @param String type
	 * @return none
	 */
	public void setFatPercent (String fatPercent) { // setter method to set fatPercent
		this.fatPercent = fatPercent; // set fatPercent data element for this product to the user specified fatPercent parameter
	}
	
	/** the getSource Method
	 * Purpose: getter method to return the milk source  
	 * @param none
	 * @return Milk source
	 */
	public String getSource() { // getter method to return Milk source
		return this.source; // return source data element for this milk product
	}
	
	/** the setSource Method
	 * Purpose: setter method to set the source for this milk product  
	 * @param String source
	 * @return none
	 */
	public void setSource (String source) { // setter method to set milk source
		this.source = source; // set source data element for this product to the user specified source parameter
	}
		
}
//Milk class written by Stephen Sturdevant