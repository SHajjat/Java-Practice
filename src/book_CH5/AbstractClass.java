package book_CH5;

public abstract class AbstractClass {
	public abstract void hello();
}
class concreate extends AbstractClass {
	
	@Override
	public void hello() {
	
	}
	
	public static void main(String[] args) {
		AbstractClass a = new AbstractClass() {
			@Override
			public void hello() {
			
			}
		};
	}
}


