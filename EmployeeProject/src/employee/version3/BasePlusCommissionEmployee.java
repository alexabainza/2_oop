package employee.version3;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double totalSales;
    private double baseSalary;



    BasePlusCommissionEmployee(){
    }
    
    BasePlusCommissionEmployee(int empID, String fName, String mName, String lName, String suffix, String title,  String empDateHired, String empBirthDate, double totalSales, double baseSalary){
        super(empID, fName, mName, lName, suffix, title, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }
	
    BasePlusCommissionEmployee(int empID, String fName, String mName, String lName, String suffix, String title,  String empDateHired, String empBirthDate){
    	super(empID, fName, mName, lName, suffix, title, empDateHired, empBirthDate);
    }
    
    
    public double getBaseSalary() {
		return baseSalary;
	}
    
    public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
    
    public double computeSalary() {
    	
    	double commissionSalary = 0;
    	if(totalSales >= 500000) {
        	commissionSalary = totalSales * .5;
    	}
    	else if(totalSales>=100000 && totalSales<500000) {
        	commissionSalary = totalSales * .3;
    	}
    	else if(totalSales>=50000 && totalSales < 100000) {
        	commissionSalary = totalSales * .2;
    	}
    	else if(totalSales>50000) {
        	commissionSalary = totalSales * .05;
    	}
    	    	
    	commissionSalary = super.computeSalary()+baseSalary;
    	return commissionSalary;
    }
    
    
        public void displayInfo(){
        	super.displayInfo();

//        System.out.println(empName.getmName());
        	System.out.println("Base salary: " + getBaseSalary() +
                            "\nTotal sales: " + getTotalSales() +
                            "\nSalary: " + computeSalary());
    }
//    @override
    public String toString() {
    	return super.toString()+
				"\nBase salary: " + String.valueOf(getBaseSalary()) +
				"\nTotal sales: " + String.valueOf(getTotalSales()) +                
				"\nSalary (including commission): " + String.valueOf(computeSalary());
    }
}
