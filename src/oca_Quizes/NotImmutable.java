package oca_Quizes;

public class NotImmutable {
	private StringBuilder builder;
	
	public NotImmutable (StringBuilder b){
		builder=b;
	}
	public StringBuilder getBuilder(){
		return  builder;
	}
	
	public static void main(String[] args) {
		NotImmutable builder = new NotImmutable(new StringBuilder("ABC"));
		builder.getBuilder().append("de");
		System.out.println(builder.getBuilder());
		
	}
}
