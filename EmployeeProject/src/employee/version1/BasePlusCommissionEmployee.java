package employee.version1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BasePlusCommissionEmployee {
	private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private double totalSales;
    private double baseSalary;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d", Locale.US); 

    BasePlusCommissionEmployee(){
    	
    }
	BasePlusCommissionEmployee(int empID, String empName,  String empDateHired, String empBirthDate, double totalSales, double baseSalary){
    	this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired, formatter);
        this.empBirthDate = LocalDate.parse(empBirthDate, formatter);
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
    }
	
	BasePlusCommissionEmployee(int empID, String empName,  String empDateHired, String empBirthDate){
    	this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired, formatter);
        this.empBirthDate = LocalDate.parse(empBirthDate, formatter);
    }
	
	public double getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }
    public void setEmpBirthDate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }
    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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
    	    	
    	commissionSalary = commissionSalary+baseSalary;
    	return commissionSalary;
    }
    
    public void displayInfo(){
        System.out.println("Employee ID: " + getEmpID()+
				"\nEmployee Name: " + getEmpName() + 
				"\nDate hired: " + getEmpDateHired() + 
				"\nDate of birth: "+ getEmpBirthDate() + 
				"\nBase salary: " + getBaseSalary() +
				"\nTotal sales: " + getTotalSales() +
				"\nSalary (including commission): " + computeSalary());    
        }
    
//    @override
    public String toString() {
    	return "Employee ID: " + String.valueOf(getEmpID())+
    			"\nEmployee Name: " + getEmpName() + 
    			"\nDate hired: "+ String.valueOf(getEmpDateHired()) + 
    			"\nDate of birth: " + String.valueOf(getEmpBirthDate())+
				"\nBase salary: " + String.valueOf(getBaseSalary()) +
				"\nTotal sales: " + String.valueOf(getTotalSales()) +
				"\nSalary (including commission): " + String.valueOf(computeSalary());
    }
}
