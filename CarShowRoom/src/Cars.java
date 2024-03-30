import java.sql.SQLOutput;
import java.util.Scanner;

public class Cars extends ShowRoom implements utility{
    String car_name;
    String car_color;
    String  car_fuel_type;
    int  car_price;
    String car_type;
    String car_transmission;
    @Override
    public void get_details(){
        System.out.println("NAME : "+car_name);
        System.out.println("COLOR : "+ car_color);
        System.out.println("FUEL TYPE : "+car_fuel_type);
        System.out.println("PRICE : "+ car_price);
        System.out.println("TYPE : "+car_type);
        System.out.println("TRANSMISSION : "+car_transmission);
    }
    @Override
    public void set_details(){
        Scanner scan =new Scanner(System.in);
        System.out.println("****************************** *** ENTER CAR DETAILS *** ***************************************");
        System.out.println();
        System.out.println("CAR NAME : ");
        car_name=scan.nextLine();
        System.out.println("CAR COLOR : ");
        car_color=scan.nextLine();
        System.out.println("FUEL TYPE : ");
        car_fuel_type=scan.nextLine();
        System.out.println("CAR PRICE : ");
        car_price=scan.nextInt();
        System.out.println("CAR TYPE ; ");
        car_type=scan.nextLine();
        System.out.println("CAR TRANSMISSION(AUTOMATIC / MANUAL) : ");
        car_transmission=scan.nextLine();
        total_cars_in_stock++;

    }

}
