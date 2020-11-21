public class balanceCheck {

    public void checkBalance( double balance, double candyCost){
        double change;
        if(balance >= candyCost){
            change = balance - candyCost;
            System.out.println("Thankyou for purchasing candy! Here is your change: $" + change);
        }
        else{
            System.out.println("Get Lost, you only have $" + balance);
        }

    }
    }



