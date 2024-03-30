import java.sql.SQLOutput;
import java.util.Scanner;

public class ShowRoom implements utility{
     public String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock=0;
    String manager_name;
    @Override
    public void get_details(){
        System.out.println("Showroom name : "+ showroom_name);
        System.out.println("Showroom address : "+ showroom_address);
        System.out.println(" Manager name : " + manager_name);
        System.out.println("Total Employees : "+ total_employees);
        System.out.println("Total cars in stock : "+ total_cars_in_stock);
    }
    @Override
    public void set_details(){
        Scanner scan=new Scanner(System.in);
        System.out.println("******************************* *** ENTER SHOWROOM DETAILS *** ************************************");
        System.out.println();
        System.out.println("SHOWROOM NAME :");
        showroom_name =scan.nextLine();
        System.out.println(" SHOWROOM ADDRESS :");
        showroom_address =scan.nextLine();
        System.out.println("MANAGER NAME :");
        manager_name=scan.nextLine();
        System.out.println("TOTAL NO OF EMPLOYEE :");
        total_employees=scan.nextInt();
        System.out.println("TOTAL CARS IN STOCK :");
        total_cars_in_stock=scan.nextInt();
    }

}
