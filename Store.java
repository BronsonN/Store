import java.util.Scanner;

public class Store {

  public static void main(String [] args) {

    Scanner keyboard = new Scanner(System.in);

    double discount = 0;

    System.out.print("Enter the price: ");
    double price = keyboard.nextDouble();

    if(price <= 100) {
      discount = 3.0;
    }
    else if(price > 100 && price <= 500) {
      discount = 5.0;
    }
    else if (price > 500) {
      discount = 8.0;
    }


    double discountCalc = price*(discount/100);
    double discountPrice = price-discountCalc;
    double gst = discountPrice*0.05;
    double finalPrice = discountPrice+gst;

    System.out.printf("Description          Amount\n");
    System.out.printf("Price%22.2f\n", price);
    System.out.print("% ");
    System.out.printf("Discount%17.2f\n", discount);
    System.out.printf("Discount%19.2f\n", discountCalc);
    System.out.printf("Summary%20.2f\n", discountPrice);
    System.out.printf("GSTS%23.2f\n", gst);
    System.out.printf("Final Price%16.2f", finalPrice);

  }

}
