package employee.version2;


public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;


    BasePlusCommissionEmployee(){
    }
   
    
    BasePlusCommissionEmployee(int empID, String empName,  String empDateHired, String empBirthDate, double totalSales, double baseSalary){
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }
	
    BasePlusCommissionEmployee(int empID, String empName,  String empDateHired, String empBirthDate){
        super(empID, empName, empDateHired, empBirthDate);
    }
    
    
    public double getBaseSalary() {
		return baseSalary;
	}
    
    public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
    
    public double computeSalary() {
    	
    	double commissionWithSalary = super.computeSalary()+baseSalary;
    	return commissionWithSalary;
    }
    
    public void displayInfo(){
        System.out.println("Employee ID: " + super.getEmpID()+
				"\nEmployee Name: " + super.getEmpName() + 
				"\nDate hired: " + super.getEmpDateHired() + 
				"\nDate of birth: "+ super.getEmpBirthDate() + 
				"\nBase salary: " + getBaseSalary() +
				"\nTotal sales: " + super.getTotalSales() +
				"\nSalary (including commission): " + computeSalary());    
        }
    
//    @override
    public String toString() {
    	return "Employee ID: " + String.valueOf(super.getEmpID())+
    			"\nEmployee Name: " + super.getEmpName() + 
    			"\nDate hired: "+ String.valueOf(super.getEmpDateHired()) + 
    			"\nDate of birth: " + String.valueOf(super.getEmpBirthDate())+
                "\nBase salary: " + String.valueOf(getBaseSalary()) +
                "\nTotal sales: " + String.valueOf(super.getTotalSales()) +
                "\nSalary (including commission): " + String.valueOf(computeSalary());
}
}
