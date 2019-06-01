package Day54_InheritanceReview;

class BlockPractice {
	static String name = "Samir";
	static {
		name = "not Samir";
		
	}
	public BlockPractice(float a){
	
	}
	public BlockPractice (double a){
		this(19.5f);
	}
	
	public static void main(String[] args) {
		System.out.println(name);
	}
}
