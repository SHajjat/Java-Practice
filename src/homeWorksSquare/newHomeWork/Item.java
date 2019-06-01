package homeWorksSquare.newHomeWork;

public class Item {
	//private instance variables
	private String name;
	private int catalogNumber;
	private int quantity;
	private double price;
	
	
	
	/**
	 * public constructor with:
	 * @param name
	 * @param quantity
	 * @param catalogNumber
	 * @param price
	 *
	 * assigns to values to instance variables
	 *
	 */
	public Item(){
	
	}
	
	public Item(String name,int quantity,int catalogNumber, double price)
	{
		setName(name);
		setPrice(price);
		setQuantity(quantity);
		setCatalogNumber(catalogNumber);
		
		
		
		
	}
	
	/**
	 * setter for name instance variable
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
		
	}
	
	/**
	 * setter for private price
	 * @param price
	 */
	public void setPrice(double price) {
		double scale = Math.pow(10, 4);
		this.price = (Math.round(price*scale))/scale;
		
	}
	
	/**
	 * getter for price
	 * @return
	 */
	public double getPrice() {
		
		return price;
	}
	
	/**
	 * getter for name
	 * @return
	 */
	public String getName(){
		
		
		return name;
	}
	
	
	public int getQuantity(){
		
		return quantity;
		
	}
	public void setQuantity(int quantity){
		
		this.quantity = quantity>=0 ?quantity:0;
		
	}
	
	public int getCatalogNumber(){
		
		return catalogNumber;
	}
	
	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
		
		
	}
	
	/**
	 * Override toString:
	 * @returns Object description in this format:
	 * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
	 */
	@Override
	public String toString() {
		return "Regular Item{name=\'"+name+"\', catalogNumber="+catalogNumber+", quantity="+quantity+
				", price="+price+"}";
		//	name=['USB drive'], catalogNumber=1234...
	}
}
