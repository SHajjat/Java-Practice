package homeWorks;
import java.util.Arrays;
public class OnlineStoreNew {
	

	
		//avaliable store items
		public static String[] ITEMS = {"Cactus", "T Shirt", "air", "Terracotta Necklace", "Coffee Mug", "Wood Crate Wall Storage", "Blanket", "Knife", "Copper Coffee and Tea Kettle", "Wall Art", 
				"Marble Clock", "Natural Bench", "Llama Valley Framed Print", "Gold Metal Frame Mirror", "Fork", "Star Wars game", "Barracuda", "Anchor", "Sunlight", "planet Saturn"};	
		//corresponding prices
		public static double[] PRICES = {49.99, 13.99, 5.99, 14.99, 29.99, 11.50, 79.99, 23.80, 27.99, 39.44, 78.40, 299.30, 55.00, 176.89, 4.99, 67.00, 8.19, 50.00, 1500, 400};
		public String[] SPECIAL_ITEMS = {"Cactus", "Fork" , "T Shirt"};
		public static double  SHIPPING_CHARGE = 11.50;

		/**
		 * Method that will find price of the item and return it
		 * Item index in the ITEMS array is corresponding to the index in the PRICES array
		 * @param item from ITEMS least 
		 * @return price for that item
		 */
		public static double findItemPrice(String item){
			
			int index = 0;
			
			for (int i = 0 ; i<ITEMS.length;i++) {
				if (ITEMS[i].equals(item)) {
				index=i;
				break;
				}
			}
			
			//double price= PRICES[index];
			return PRICES[index]; 
		
			
		}
		/**
		 * Calculate discount 1 
		 * For members: When purchased total 10 + items -> get 10% discount 
		 * For non-members: When purchased total 10 + items -> get 5% discount
		 * 
		 * If order has less then 10 items, then there will be no discount
		 * If no discount, then return 0
		 * @param List
		 *            of items in the order
		 * @return discount percent based on the items count
		 */
		public static int discountByItemCount(String[] order, boolean isMember) {
			
			
			int discount = 0;
			if (order.length >=10) {
				discount = isMember ? 10 :5;
			}
			
			return discount;
		}
	/**
	 * Method to calculate number of occurrences of a certain item in the order
	 * 
	 * For example, if order has the following items and item name is "cactus": 
	 * 			      	"dog", "cactus", "cactus", "coffee mug" -> return 2
	 * if order has the following items and item name is "coffee mug": 
	 * 				    "dog", "cactus", "cactus", "coffee mug" -> return 1
	 * if order has the following items and item name is "pillow": 
	 *                "dog", "cactus", "cactus", "coffee mug", "coffee mug", "coffee mug" -> return 0
	 * @param order 
	 * @param itemName
	 * @return  number of occurrences of a certain item in the order
	 */
		public int getNumberOfItemOccurrences(String[] order, String itemName){
		
			int count = 0;
			for (String a : order) {
				if (a.equals(itemName)) {
					count++;
				}
			}
			return count;
		}
		
		/**
		 * Method to calculate how many duplicated items in the order
		 * For example, if order has the following items: 
		 * 				"dog", "cactus", "cactus", "coffee mug" -> return 1
		 *              "dog", "cactus", "cactus", "coffee mug", "coffee mug", "coffee mug" -> return 2
		 *              
		 *              if order has no repeating items, return 0
		 *              "dog", "cactus", "table", "coffee mug" -> return 0
		 * 
		 * Use getNumberOfItemOccurrences() to check how many times each item is present in the list
		 * 
		 * @param order
		 * @return number of duplicated items in the order
		 */
		 
		public int getNumberOfDuplicateItems(String[] order) {
			
			int count = 0;
			String strOrder = "";
			for (int i = 0 ; i<order.length;i++) {
				if (getNumberOfItemOccurrences(order, order[i])>=2 && !(strOrder.contains(order[i]))){
					strOrder+=order[i];
					count++;
				}
				
			}
			return count;
		    }

		/**
		 * Calculate discount 2 
		 * For members: When purchased 3 special items  -> get 2 extra special items for free 
		 * For non-members: When purchased 3 special items -> get 1 special extra item for free
		 * 
		 * Special items are listed in a SPECIAL_ITEMS array
		 * 
		 * For example, if order has the following items and member is true: 
	     * 			      	"dog", "cactus", "cactus", "coffee mug" -> return {"dog", "cactus", "cactus", "coffee mug"}
		 * if order has the following items and member is true: 
	     * 			      	"dog", "cactus", "cactus", "cactus", "coffee mug" -> return {"dog", "cactus", "cactus", "cactus", "coffee mug", "cactus", "cactus"}
		 * if order has the following items and member is false: 
	     * 			      	"dog", "cactus", "cactus", "cactus", "cactus", "coffee mug" -> return {"dog", "cactus", "cactus", "cactus", "cactus", "coffee mug", "cactus"}
		 * 
		 * When no special items in the order, then order will be returned without change
		 * 					"dog", "transmission", "barracuda", "coffee mug", "Star Wars game"
		 * 				
		 * @param List of items in the order, member
		 * @return new array that will have original items in the order and free items added at the end of the order
		 */
			public String[] buyThreeDiscount(String[] order, boolean isMember) {
			
				String added="";
					for (String special : SPECIAL_ITEMS) {
						if (getNumberOfItemOccurrences(order, special )>=3) {
							added=special;
						}
					}
				if (isMember && added.length()>0) {
					order = Arrays.copyOf(order, order.length+2);
					order[order.length-1]=added;order[order.length-2]=added;	
				}else if (!isMember && added.length()>0) {
					order = Arrays.copyOf(order, order.length+1);
					order[order.length-1]=added;
				}
				return order;
			    }	
		/**
		 * Calculate total for all items in the order
		 * 
		 * Use findItemPrice() to find price of the item in the order and sum them up
		 * For example, if order has the following items and member is true: 
	     * 			      	"Cactus", "T Shirt", "air" -> return 69.97
	     * 
	     * 
		 * @param order
		 * @return order total
		 */
		public static double getOrderTotalWithoutDiscount(String[] order) {
			
			double sum = 0.0;
			for (String item : order) {
				sum+=findItemPrice(item);
				
			}
			return sum;
	    }

		/**
		 * Calculate discount 3 
		 * For members: When purchased 2 items that are over 50.00$ each -> get 18% 
		 * For non-members: When purchased 2 items that are over 75.00$ each -> get 7%
		 * 
		 * For example: if order has the following items and member is true: 
	     * 			      	"Cactus", "T Shirt", "air" -> return 0
		 * 
		 * @param List of items in the order
		 * @return discount percent based on the individual item price
		 */
		public static int discountByItemPrice(String[] order, boolean isMember) {
			
			boolean overThrush = false;byte count = 0;
			int thrush = isMember? 50:75 , discount=0;
			for (String item : order) {
				if (findItemPrice(item)>=thrush) {
					count++;
					overThrush =count>=2;
				}
			}
			if (isMember && overThrush) {
				discount=18;
			}else if (!isMember && overThrush) {
				discount=7;
			}
				
			
			
	        return discount;

	    }
		
		/**
		 * Check if shipping is free
		 * For members: When total order amount is over 75.00$ -> free shipping
		 * For non-members: When total order amount is over 150.00$ -> free shipping
		 * 
		 * @param List
		 *            of items in the order
		 * @return true if free shipping is applicable, false otherwise
		 */
		public static boolean isShippingFree(String[] order, boolean isMember) {
		
			int thrush = isMember?75:150;
			return getOrderTotalWithoutDiscount(order)>=thrush;
			
	    }

		
		
		/**
		 * Calculate total order amount
		 * When the order is eligible for two different discounts (total amount discounts), only one should be applied (the highest)
		 * 
		 * First find if any of the discount can be applied to the order: DiscountByItemPrice() 
		 *                                                                DiscountByItemCount()
		 * Apply highest of the two discounts, if any of them present
		 *                                                                
		 * Find if shipping is free or if not, add shipping charge       isShippingFree()
		 *  to add shipping charge use SHIPPING_CHARGE variable
		 * 
		 * 
		 * 
		 * @param List of items in the order           
		 * @return total order amount with discount and shipping charge if applicable
		 */
		public static double calculateOrderTotalWithDiscountsAndShipping(String[] order, boolean isMember){
			
			int discount = discountByItemPrice(order,isMember) >discountByItemCount(order,isMember)?discountByItemPrice(order,isMember):discountByItemCount(order,isMember);
			double total = isShippingFree(order, isMember)?getOrderTotalWithoutDiscount(order)*discount:getOrderTotalWithoutDiscount(order)*discount+SHIPPING_CHARGE;
			return total;
		        
		    }
			
		/**
		 * This method will print receipt with all details including discounts 
		 */
		public void printReceipt(){
			//TO DO
//			String[] items =order;
//			calculateOrderTotalWithDiscountsAndShipping(order, isMember)
		}

			


	public static void main(String[] args) {
		String[] order6={"Star Wars game",  "Gold Metal Frame Mirror", "T Shirt", "T Shirt", "Sunlight", "planet Saturn"};
		String[] order5={"Coffee Mug", "Coffee Mug", "Coffee Mug", "T Shirt",  "Coffee Mug",  "Coffee Mug", "T Shirt", "T Shirt"};
//		System.out.println(discountByItemPrice(order5, false));
//		for (String item : order6) {
//		System.out.println(findItemPrice(item));
//		
//		}
		String[] order1={"Cactus", "T Shirt", "Gold Metal Frame Mirror", "Fork",  "Anchor", "Sunlight", "planet Saturn"};
		System.out.println(calculateOrderTotalWithDiscountsAndShipping(order1, false));
	}
	}
	

