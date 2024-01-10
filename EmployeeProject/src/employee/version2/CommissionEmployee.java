package employee.version2;


public class CommissionEmployee extends Employee{
    private double totalSales;


    CommissionEmployee(){
    }
    
    CommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate, double totalSales){
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }
    
    CommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate){
        super(empID, empName, empDateHired, empBirthDate);
    }    
    
    public double getTotalSales() {
		return totalSales;
	}
    
    public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

    public double computeSalary() {
    	double salary = 0;
    	
    	if(totalSales >= 500000) {
        	salary = totalSales * .5;
    	}
    	else if(totalSales>=100000 && totalSales<500000) {
        	salary = totalSales * .3;
    	}
    	else if(totalSales>=50000 && totalSales < 100000) {
        	salary = totalSales * .2;
    	}
    	else if(totalSales>50000) {
        	salary = totalSales * .05;
    	}
    	
    	return salary;
    }
    
    public void displayInfo(){
    	super.displayInfo();
        System.out.println( 
				"Total sales: " + getTotalSales() +
				"\nSalary: " + computeSalary());    
        }
    
    public String toString() {
    	return super.toString() + 
			"\nTotal sales: " + String.valueOf(getTotalSales()) +
			"\nSalary: " + String.valueOf(computeSalary());
    }
    }    
