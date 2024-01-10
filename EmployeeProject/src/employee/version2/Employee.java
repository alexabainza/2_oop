package employee.version2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Employee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;

    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d", Locale.US); 
    
    public Employee() {
    	
    };
    
    public Employee(int empID, String empName, String empDateHired, String empBirthDate) {
    	 this.empID = empID;
         this.empName = empName;
         this.empDateHired = LocalDate.parse(empDateHired, formatter);
         this.empBirthDate = LocalDate.parse(empBirthDate, formatter);
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
    
    public void displayInfo(){
        System.out.println("Employee ID: " + getEmpID()+
        					"\nEmployee Name: " + getEmpName() + 
        					"\nDate hired: " + getEmpDateHired() + 
        					"\nDate of birth: "+ getEmpBirthDate()); 

    }
    
//    @override
    public String toString() {
    	return "Employee ID: " + String.valueOf(getEmpID())+
    			"\nEmployee Name: " + getEmpName() + 
    			"\nDate hired: "+ String.valueOf(getEmpDateHired()) + 
    			"\nDate of birth: " + String.valueOf(getEmpBirthDate());
    }
}
