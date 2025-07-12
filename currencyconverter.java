import java.util.*;
public class currencyconverter {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      double rate=0, amount,convert;
      String symbol=" ",base,target,pair;
      System.out.println("Available currencies : USD, INR, EUR");
      System.out.println("Enter base currency: ");
      base=in.next().toUpperCase();
      System.out.println("Enter target currency: ");
      target=in.next().toUpperCase();
      System.out.println("Enter the amount to convert: ");
      amount=in.nextDouble();
      pair=base+ "_" +target;
      switch (pair){
          case"USD_INR":
            rate=83.5;
            break;
          case "INR_USD":
            rate = 1/83.5;
            break;
          case "USD_EUR":
            rate = 0.92;
            break;
          case "EUR_USD":
            rate = 1/0.92;
            break;
          case "INR_EUR":
            rate = 0.011;
            break;
          case "EUR_INR":
            rate = 90.0;
            break;
          default:
          System.out.println("Invalid Currency pair");

        }
        convert= amount*rate;
        System.out.println("Converted amount: " +convert+" " +target);
    }
    
}
