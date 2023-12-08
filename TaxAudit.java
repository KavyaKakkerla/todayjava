package audit;
public class TaxAudit implements Audit
{	
	
	public double taxChecker(double totalIncome)
	{	
		return 0.1*totalIncome;
	}
	public double taxtPaid(double taxpaid)
	{	
		return taxpaid;
	}
	public double homeExpenditure(double homeExpenditure)
	{
		return homeExpenditure;
	}
	public double healthExpenditure(double healthExpenditure)
	{
		return healthExpenditure;
	}
	public double vehicleExpenditure(double vehicleExpenditure)
	{
		return vehicleExpenditure;
	}
	public double personalFamilyExpenditure(double personalFamilyExpenditure)
	{
			return personalFamilyExpenditure;
	}
	public double misceExpenditure(double misceExpenditure)
	{
			return misceExpenditure;
	}
	public void conductAudit(double totalIncome,double taxpaid,double homeExpenditure,double healthExpenditure,double vehicleExpenditure,double personalFamilyExpenditure,double misceExpenditure)
	throws TaxFraudException
	{
		double totalExpenditure=homeExpenditure+healthExpenditure+vehicleExpenditure+personalFamilyExpenditure+misceExpenditure;
		double calculatedTax = taxChecker(totalIncome);
        double actualTaxpaid = taxpaid + totalExpenditure * 0.1;
        if(calculatedTax!=actualTaxpaid)
        {
        		double fraudAmount = calculatedTax - actualTaxpaid;
            throw new TaxFraudException("Tax fraud detected! You have to pay an additional amount of: $" + fraudAmount);
         }
      }
   }





