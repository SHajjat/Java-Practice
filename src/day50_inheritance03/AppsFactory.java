package day50_inheritance03;

public class AppsFactory {
	public static void main(String[] args) {
		IphoneApp iApp = new IphoneApp();
		IphoneApp iApp2 = new IphoneApp("Uber");
		AndroidApp andApp = new AndroidApp("Ra8a9ni");
		AndroidApp andApp2 = new AndroidApp();
		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());
		System.out.println(andApp.getName());
		System.out.println(andApp2.getName());
		
		//calling Static method from parent and child classes
		App.builtWith("Whatsapp", "Java");
		AndroidApp.builtWith("Xnxx" , "Ruby");
		IphoneApp.builtWith("brazzers" , "Rubby on rails ");
	}
}
