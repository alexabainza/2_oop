package employee.version4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Employee {
    private int empID;
    private Name empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;

    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d", Locale.US); 
    
    public Employee() {
    	
    };
    
    public Employee(int empID, String fName, String mName, String lName, String suffix, String title, String empDateHired, String empBirthDate) {
    	 this.empID = empID;
         this.empName = new Name(fName, mName, lName, suffix, title);
         this.empDateHired = LocalDate.parse(empDateHired, formatter);
         this.empBirthDate = LocalDate.parse(empBirthDate, formatter);
    }
    
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
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
    
    public void displayInfo(){
    	System.out.println("Employee ID: " + getEmpID());
    	empName.displayName();
        System.out.println("\nDate hired: " + getEmpDateHired() + 
        					"\nDate of birth: "+ getEmpBirthDate()); 

    }
    
    @Override
    public String toString() {
    	return "Employee ID: " + String.valueOf(getEmpID())+
    			"\nEmployee Name: " + empName.toString()+ 
    			"\nDate hired: "+ String.valueOf(getEmpDateHired()) + 
    			"\nDate of birth: " + String.valueOf(getEmpBirthDate());
    }
}
