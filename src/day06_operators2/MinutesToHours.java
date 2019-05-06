package day06_operators2;

public class MinutesToHours {

	public static void main(String[] args) {
		int minutes =125 , hours ;
		hours = minutes /60;
        minutes = minutes % 60;
        System.out.println(" number of hours " +hours + "  number of minutes "+ minutes);
	}

}
