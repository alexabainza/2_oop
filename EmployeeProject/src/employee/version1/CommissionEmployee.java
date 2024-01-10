package employee.version1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CommissionEmployee {
	private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private double totalSales;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d", Locale.US); 

    CommissionEmployee(){
    	
    }
    
    CommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate, double totalSales){
    	this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired, formatter);
        this.empBirthDate = LocalDate.parse(empBirthDate, formatter);
        this.totalSales = totalSales;
    }
    
    CommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate){
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
    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
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
        System.out.println("Employee ID: " + getEmpID()+
				"\nEmployee Name: " + getEmpName() + 
				"\nDate hired: " + getEmpDateHired() + 
				"\nDate of birth: "+ getEmpBirthDate() + 
				"\nTotal sales: " + getTotalSales() +
				"\nSalary: " + computeSalary());    
        }
    
    public String toString() {
    	return "Employee ID: " + String.valueOf(getEmpID())+
    			"\nEmployee Name: " + getEmpName() + 
    			"\nDate hired: "+ String.valueOf(getEmpDateHired()) + 
    			"\nDate of birth: " + String.valueOf(getEmpBirthDate())+
				"\nTotal sales: " + String.valueOf(getTotalSales()) +
				"\nSalary: " + String.valueOf(computeSalary());
    }
    }    
