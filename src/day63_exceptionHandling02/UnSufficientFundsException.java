package day63_exceptionHandling02;

public class UnSufficientFundsException extends RuntimeException {
	public UnSufficientFundsException(){
		System.out.println(UnSufficientFundsException.class.getSimpleName());
	}
 public UnSufficientFundsException(String WhatsUp){
	 super(WhatsUp);
 }

}
class hello {
	public static void main(String[] args)  {
		double balance = 200;
		double transaction =210;
		try {
			if ( transaction > balance ) {
				//	throw new UnSufficientFundsException();
				throw new UnSufficientFundsException("balance is too low");
			}
			//throw new UnSufficientFundsException();
			//throw new UnSufficientFundsException("hello");
			//throw new Error();
		}finally{
			try {
				throw new NoMoreCoffeeException();
			} catch (NoMoreCoffeeException e) {
				e.printStackTrace();
			}
		}
	}
}
class NoMoreCoffeeException extends Exception{
	public NoMoreCoffeeException(){ }
	public NoMoreCoffeeException(String messege){
		super(messege);
	}
}