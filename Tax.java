import audit.Audit;
import audit.TaxAudit;
import audit.TaxFraudException;
import java.util.Scanner;

public class Tax
{	
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		try
		{	
			System.out.print("Enter total income: $");
            double totalIncome = sc.nextDouble();

            System.out.print("Enter total tax paid: $");
            double taxpaid = sc.nextDouble();

            System.out.print("Enter home expenditure: $");
            double homeExpenditure = sc.nextDouble();

            System.out.print("Enter health expenditure: $");
            double healthExpenditure = sc.nextDouble();

            System.out.print("Enter vehicle expenditure: $");
            double vehicleExpenditure = sc.nextDouble();

            System.out.print("Enter personal and family expenditure: $");
            double personalFamilyExpenditure = sc.nextDouble();

            System.out.print("Enter miscellaneous expenditure: $");
            double misceExpenditure = sc.nextDouble();
            
            
            TaxAudit A=new TaxAudit();
            
            A.conductAudit(totalIncome,taxpaid,homeExpenditure, healthExpenditure,vehicleExpenditure,personalFamilyExpenditure,misceExpenditure);
            System.out.println("no fruad detected. Audit succes full");
          }
         	catch(TaxFraudException e)
         	{
         		System.err.println("Tax Fraud Exception"+e.getMessage());
         	}
         	catch(Exception e)
         	{
         		System.err.println("Tax Fraud Exception"+e.getMessage());
         	}
         	finally
         	{
         		sc.close();
         	}
 	}
 }
 
 
 
 

