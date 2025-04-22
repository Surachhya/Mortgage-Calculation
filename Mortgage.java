//*****************************************
  //   Programmer: Surachhya Adhikari
  //   CTP 150 - section: 400
  //   Lab 2
  //   Version 1.0
/**
   The Mortgage class represents mortgage loan information and 
   provides methods for calculations.
*/
public class Mortgage
{
   
   //declare variable and constant
   private double monthlyPay;
   private double oldPrin;	
   public static final double INT_RATE = 0.0749;
	

/**
   This constructor initializes the mortgage with a monthlyPAy and oldPrin of 0.0.
*/

   public Mortgage()//default no param.
   {
   monthlyPay = 0.0;
   oldPrin = 0.0;

   }


/**
   The constructor initializes the mortgage with a specified monthlyPAy and oldPrin
   @param monPay The montly pay.
   @param op The old Principal.
*/

   public Mortgage(double monPay, double op)  
   {
     monthlyPay = monPay;
     oldPrin = op;
   }

/**
   The setMonthlyPay method sets the Mortgage's monthly pay.
   @param monPay The montly pay.
*/

   public void setMonthlyPay(double monPay)
    {
      monthlyPay = monPay;
   }
   
/**
   The setOldPrin method sets the Mortgage's old principal.
   @param op old Principal.
*/

   public void setOldPrin(double op)
    {
      oldPrin = op;
      
   }
/**
   Gets the formatted monthly payment.
   @return The formatted monthly payment as a string.
*/
   
   public String getMonthlyPay() 
   {
        return String.format("%.2f", monthlyPay);
    }
/**
   The getOldPrin method returns the old principal.
   @return The old principal.
*/

  public double getOldPrin()
   {
      return oldPrin;
    }

/**
   Calculate and return the amount of interest paid for the current month.
   @return The amount of interest paid.
*/
    public double calAmtInt() 
    {
        return (INT_RATE / 12) * oldPrin;
    }


/**
   Calculate and return the amount applied to the principal for the current month.
   @return The amount applied to the principal.
*/
    public double calToPrin()
     {
        return monthlyPay - calAmtInt();
    }

 /**
   Calculate and return the new principal amount (loan balance) after the current month's payment.
   @return The new principal amount (loan balance).
*/
    public double calNewPrin() 
    {
        return oldPrin - calToPrin();
    }
/**
   The displayInfo method displays mortgage information.
*/

   public void displayInfo() 
   {
      System.out.println("Old Principal: $" + getOldPrin());
      System.out.println("Monthly Payment: $" + getMonthlyPay());
      System.out.println("Interest Paid: $" + calAmtInt());
      System.out.println("Amount Applied to Principal: $" + calToPrin());
      System.out.println("New Balance: $" + calNewPrin());
   
   }
}

