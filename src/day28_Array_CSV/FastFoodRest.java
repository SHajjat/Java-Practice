package day28_Array_CSV;

//copy file , right click on FILE NAME (not src ) paste 
import java.io.IOException;
import java.nio.*;// new input output
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FastFoodRest {
	public static void main(String[] args) throws IOException {
		// read all data and assign to String array .
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
// Type of data   name     from file read all lines in this path and convert to String Array 0 is the type of array not size

		System.out.println("data size : " + data.length);
		// print each Resturant information in separate line
//
//		for (String strArr : data) {
//			System.out.println(strArr);
//		}
		// print all resturants in VA and count how many

		int count = 0;
		for (String strArr : data) {
			if (strArr.contains(",VA,")) {
				 System.out.println(strArr);
				count++;

			}

		}
		System.out.println("there is " + count + " in VA");
		
		
		for (String strArr : data) {
			if (strArr.contains(",VA,")) {
				String [] restArr = strArr.split(",");
				System.out.println(restArr[2]+" - "+restArr[1]);
			}
		}

//		String [][] dataSeparated = new String [data.length][data[1].length()];
//		for (String [] Temp ) {
//			dataSeparated[i][]= data[i].split(",");
//			System.out.println(Arrays.toString(dataSeparated[i]));
//			
//		}
//		System.out.println(dataSeparated[1][0]);
//		

	}

}
