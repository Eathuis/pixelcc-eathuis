import java.util.Scanner;

class TicketPriceWithDiscount {

  public static void main (String args[]) {
    Scanner myScanner = new Scanner (System.in) ;
    int age;
    double price = 0.00;
    char reply;
    
    System.out.print ("How old are you? ");
    age = myScanner.nextInt();
    
    System.out.print ("have a coupon? (Y/N) ");
    reply = myScanner.findWithHorizon (".", 0)
                                       .charAt (0);
    
    if (age >= 12 && age < 65) {
        price = 9.25;
    }
    if (age < 12 || age >= 65) {
        price = 5.25;
    }
    
    if (reply == "Y" || reply == "y") {
        price -= 2.00;
    }
    if (reply != "Y" && reply != "y" &&
        reply!="N" && reply!="n") {
        System.out.println("Huh?");
    }
    
    System.out.print("Please pay £");
    System.out.print(price);
    System.out.print(". ");
    System.out.println("Enjoy the show!);
    
  }
}
