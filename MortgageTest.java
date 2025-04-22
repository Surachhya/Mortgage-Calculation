
import java.util.Scanner;

public class MortgageTest
{
  
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print("Enter this month's payment (dollars.cents):");
      double payment = keyboard.nextDouble();
          
      System.out.print("Enter the principal owed (dollars.cents):");
      double oldPrincipal = keyboard.nextDouble();
          // Same procedure guarantees accuracy of last penney here, too.
      Mortgage m = new Mortgage(payment, oldPrincipal);
      
      double interestAmount = m.calAmtInt();
          // Explicit cast required since division is type double.
   
      double toPrincipal = m.calToPrin();
   
      double newPrincipal = m.calNewPrin();
   
   
      System.out.printf("\nPrevious Balance: %.2f\n", oldPrincipal);
      System.out.printf("Payment: %.2f\n", payment);
      System.out.printf("Interest Paid: %.2f\n", interestAmount);
      System.out.printf("Amount applied to principle: %.2f\n", toPrincipal);
      System.out.printf("New Balance: %.2f\n", newPrincipal);
   
   }
   
}

