package homeWorks;
import java.util.*;
public class Database {
	public static String lameDb(String db, String op, String id, String data) {
		List<String> newDb = new ArrayList<String>(Arrays.asList(db.split("#")));
		int intID = Integer.parseInt(id);
System.out.println(newDb);
		switch (op) {
		case ("add"):

			newDb.add(intID+data);

			break;
		case ("edit"):
			newDb.set(intID - 1, id + data);

			break;
		case ("delete"):
			newDb.remove(intID - 1);

			break;
		}

		return db.toString();

	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

}
