package day42_customclasses_encapsulation;
import java.lang.*;
public class Coffee {
    String name  ;
    String  size ;
    double price ;
    int calories;

    public void gerCoffeeInfo(){
        String info = name.toUpperCase() + " "+size.toUpperCase() + " $"+price+" "+ calories+" CAL";

        System.out.println();

    }
}
