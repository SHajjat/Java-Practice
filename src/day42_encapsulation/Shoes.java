package day42_encapsulation;

public class Shoes {
	String brand;
	double size;
	
	public void setShoesData(String brand , double size) {
		this.brand=brand;
		this.size=size;
		}
	
	public String getShoesData() {
		return brand+" | "+size;
	}

}
