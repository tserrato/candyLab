// Import Scanner Class
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;


public class main {    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double candyPrice;
        double balance;
        String choice;
        candyShop store = new candyShop();
        balanceCheck check = new balanceCheck();

        System.out.println("What is your balance? : ");

        balance = in.nextDouble();

        System.out.println("A: $0.65 -Twix");
        System.out.println("B: $0.50 -Chips");
        System.out.println("C: $0.75 -Nutter Butter");
        System.out.println("D: $0.65 -Peanut Butter Cup");
        System.out.println("E: $0.55 -Juicy Fruit Gum");
        System.out.println("\n");
        
        System.out.println("What would you like? : ");
        
        choice = in.next();


        candyPrice = store.shop(choice);
        

        check.checkBalance(balance, candyPrice);

        


    }
}
