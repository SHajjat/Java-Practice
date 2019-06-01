package homeWorksSquare.newHomeWork;

public class Store {
	public static void main(String[] args) {
		Item item = new Item("Ahmad", 1,1,300);
		OnSaleItem onsale = new OnSaleItem("yoo ", 1,2,100,1);
		System.out.println(onsale.getName());
		
		TJMaxx tj = new TJMaxx();
		tj.addRegularItem(item);
		tj.addOnSaleItem(onsale);
		System.out.println(tj.getItemPrice(1));
		//tj.getItemPrice(1);
		System.out.println(tj.getItemPrice(2));
		tj.removeItem(2);
		System.out.println(tj.getOnSaleItems());
		System.out.println(tj.getAllItemNames());
		System.out.println(onsale.getCatalogNumber());
		tj.removeItem(2);
		System.out.println(tj.getAllItemNames());
		System.out.println(tj.getItemPrice(2));
		
	}
}
