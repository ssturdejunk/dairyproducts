// Source code for Final Project
// Name: Stephen Sturdevant
// Teammate: Chris Carpenter
// Class: CIT-260 Section 7
// Date: March 25, 2019
// Base Class DairyProduct
package dairyProducts;

class DairyProduct {
	
	//Data element variables – identification and nutrition info
	private String name; // variable to store name of dairyProduct object
	private double servingSize; // variable to store numeric serving size of dairyProduct object (ounces)
	private double numberOfServings; // variable to store numeric count of servings contained in the product of dairyProduct object
	private double caloriesPerServing; // variable to store the numeric value of calories per serving of dairyProduct object
	private boolean vitaminA; // variable to store true/false value of if this dairyProduct object contains vitamin A
	private boolean vitaminC; // variable to store true/false value of if this dairyProduct object contains vitamin A
	private boolean calcium; // variable to store true/false value of if this dairyProduct object contains vitamin A
	private double fat; // variable to store the numeric value of fat content per serving of dairyProduct object

	//Methods 
	
	/** the DairyProduct Method
	 * Purpose: default method to create object with default values
	 * @param none
	 * @return none
	 */
	public DairyProduct() { // default DairyProduct object constructor no parameters
		this.name = "Dairy Product"; // default product name
		this.servingSize = 8; // default serving size in ounces
		this.numberOfServings = 1; // default number of servings in product
		this.caloriesPerServing = 100; // default number of calories in a dairy product
		this.vitaminA = false; // default vitamin A containment 
		this.vitaminC = false; // default vitamin C containment 
		this.calcium = true; // default Calcium containment 
		this.fat = 100; // default fat content in grams 
	}
	
	/** the DairyProduct Method
	 * Purpose: custom dairy product object method to create object with parameter values
	 * @param none
	 * @return none
	 */
	public DairyProduct(String name, double servingSize, double numberOfServings, double caloriesPerServing, boolean vitaminA,
			boolean vitaminC, boolean calcium, double fat) {
		this.name = name; // set name to user specified name parameter
		this.servingSize = servingSize; // set serving size to user specified value
		this.numberOfServings = numberOfServings; // set number of servings to user specified value
		this.caloriesPerServing = caloriesPerServing; // set caloric content to user specified value
		this.vitaminA = vitaminA; // set vitamin A to user specified true/false
		this.vitaminC = vitaminC; // set vitamin C to user specified true/false
		this.calcium = calcium; // set calcium containment to user specified true/false
		this.fat = fat; // set fat content to user specified value
	}
	
	/** the getProductInfo Method
	 * Purpose: getter method to return the information of this dairy product object
	 * @param none
	 * @return Full details on product including name, number of servings, serving size and nutritional value
	 */
	public String getProductInfo() { // string method to display identification and nutrition of this object
		String info = "Product name = " + this.getName() + "\n"; // list name and move to next line
		info += "Serving size = " + this.getServingSize()  + "\n"; // list serving size and move to next line
		info += "Number of servings = " + this.getNumberOfServings()  + "\n"; // list number of servings and move to next line
		info += "Calories per serving = " + this.getCaloriesPerServing()  + "\n"; // list calories per serving and move to next line
		info += "Vitamin A = " + this.getVitaminA()  + "\n"; // list vitamin A containment and move to next line
		info += "Vitamin C = " + this.getVitaminC()  + "\n"; // list vitamin C containment and move to next line
		info += "Calcium = " + this.getCalcium()  + "\n"; // list calcium containment and move to next line
		info += "Fat = " + this.getFat()  + "\n"; // list fat content and move to next line
		info += "Total calories = " + this.getTotalCalories()  + "\n"; // list total calories contained in the product and move to next line
		return info;
	}

	/** the getServingSize Method
	 * Purpose: getter method to return the numeric serving size value of this object  
	 * @param none
	 * @return Serving size
	 */
	public double getServingSize() { // getter method to return serving size
		return this.servingSize; // return servingSize data element for this product
	}
	
	/** the setServingSize Method
	 * Purpose: setter method to set the numeric serving size value of this object  
	 * @param double size
	 * @return none
	 */
	public void setServingSize (double size) { // setter method to set serving size
		this.servingSize = size; // set servingSize data element for this product to the user specified size parameter
	}
	
	/** the getCaloriesPerServing Method
	 * Purpose: getter method to return the numeric calories per serving value of this object  
	 * @param none
	 * @return calories per serving
	 */
	public double getCaloriesPerServing() { // getter method to return calories per serving size
		return this.caloriesPerServing; // return caloriesPerServing data element for this product
	}
	
	/** the setCaloriesPerServing Method
	 * Purpose: setter method to set the numeric caloric value per serving of this object  
	 * @param double calories
	 * @return none
	 */
	public void setCaloriesPerServing (double calories) { // setter method to set caloric value per serving size
		this.caloriesPerServing = calories; // set caloriesPerServing data element for this product to the user specified size parameter
	}
	 
	/** the getVitaminA Method
	 * Purpose: getter method to return the boolean value of if this dairy product object contains vitamin A  
	 * @param none
	 * @return this.vitaminA
	 */
	public boolean getVitaminA() { // getter method to return boolean indicator as to if this product contains vitamin A
		return this.vitaminA; // return vitaminA data element for this product
	}
	
	/** the setVitaminA Method
	 * Purpose: setter method to set the boolean value of if this dairy product object contains vitamin A  
	 * @param boolean vitaminA
	 * @return none
	 */
	public void setVitaminA (boolean vitaminA) { // setter method to set boolean indicator as to if this product contains vitamin A
		this.vitaminA = vitaminA; // set vitaminA data element for this product to the user specified parameter 
	} 

	/** the getVitaminC Method
	 * Purpose: getter method to return the boolean value of if this dairy product object contains vitamin C  
	 * @param none
	 * @return this.vitaminC
	 */
	public boolean getVitaminC() { // getter method to return boolean indicator as to if this product contains vitamin C
		return this.vitaminC; // return vitaminC data element for this product
	}
	
	/** the setVitaminC Method
	 * Purpose: setter method to set the boolean value of if this dairy product object contains vitamin C  
	 * @param boolean vitaminC
	 * @return none
	 */
	public void setVitaminC (boolean vitaminC) { // setter method to set boolean indicator as to if this product contains vitamin C
		this.vitaminC = vitaminC; // set vitaminC data element for this product to the user specified parameter 
	}
	 
	/** the getCalcium Method
	 * Purpose: getter method to return the boolean value of if this dairy product object contains calcium  
	 * @param none
	 * @return this.calcium
	 */
	public boolean getCalcium() { // getter method to return boolean indicator as to if this product contains calcium
		return this.calcium; // return calcium data element for this product
	}
	
	/** the setCalcium Method
	 * Purpose: setter method to set the boolean value of if this dairy product object contains calcium  
	 * @param boolean calcium
	 * @return none
	 */
	public void setCalcium (boolean calcium) { // setter method to set boolean indicator as to if this product contains calcium
		this.calcium = calcium; // set calcium data element for this product to the user specified parameter
	}

	/** the getFat Method
	 * Purpose: getter method to return the numeric value of fat contained in this dairy product object  
	 * @param none
	 * @return this.fat
	 */
	public double getFat() { // getter method to return fat content per serving size
		return this.fat; // return fat data element for this product
	}
	
	/** the setFat Method
	 * Purpose: setter method to set the numeric value of fat contained in this dairy product object  
	 * @param double fatness
	 * @return none
	 */
	public void setFat (double fatness) { // setter method to set fat amount per serving
		this.fat = fatness; // set fatness data element for this product to the user specified parameter
	}

	
	/** the getName Method
	 * Purpose: getter method to return the name of this dairy product object
	 * @param none
	 * @return this.name
	 */
	public String getName() { // getter method to return the name of this dairy product object
		return this.name; // return name data element for this product
	}
	
	/** the setName Method
	 * Purpose: setter method to set the name of this dairy product object
	 * @param String name
	 * @return none
	 */
	public void setName(String name) { //setter method to set the name of this dairy product object
		this.name = name; // set name data element for this product to the user specified parameter
	}

	/** the getNumberOfServings Method
	 * Purpose: getter method to return the number of servings contained in this dairy product object  
	 * @param none
	 * @return this.numberOfServings
	 */
	public double getNumberOfServings() { //getter method to return the number of servings contained in this dairy product object
		return this.numberOfServings; // return numberOfServings data element for this product
	}
	
	/** the setNumberOfServings Method
	 * Purpose: setter method to set the number of servings contained in this dairy product object  
	 * @param double servings
	 * @return none
	 */
	public void setNumberOfServings (double servings) { //setter method to set the number of servings for this dairy product object
		this.numberOfServings = servings; // set the number of servings data element for this product to the user specified parameter
	}

	
	/** the getTotalCalories Method
	 * Purpose: method to calculate and return the total caloric value contained in this dairy product object 
	 * formula: number of servings * calories per serving 
	 * @param none
	 * @return calculated total caloric value
	 */
	public double getTotalCalories() { // method to calculate and return the total caloric value contained in this dairy product object
		return this.numberOfServings*this.caloriesPerServing; // return calculated value of total calories for this product
	}
	 
}
// DairyProduct class written by Stephen Sturdevant