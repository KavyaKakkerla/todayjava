package audit;



public interface Audit
{	
	double taxChecker(double totalIncome);
	double taxtPaid(double taxpaid);
	double homeExpenditure(double homeExpenditure);
	double healthExpenditure(double healthExpenditure);
	double vehicleExpenditure(double vehicleExpenditure);
	double personalFamilyExpenditure(double personalFamilyExpenditure);
	double misceExpenditure(double misceExpenditure);
	
	void conductAudit(double totalIncome,double taxpaid,double homeExpenditure,double healthExpenditure,double vehicleExpenditure,double personalFamilyExpenditure,double misceExpenditure)
	throws TaxFraudException;
	
}


