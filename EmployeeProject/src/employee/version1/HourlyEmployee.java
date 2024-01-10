/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d", Locale.US); 
    
    public HourlyEmployee() {
    	
    }
    
    HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate, float totalHoursWorked, float ratePerHour){
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired, formatter);
        this.empBirthDate = LocalDate.parse(empBirthDate, formatter);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate){
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary(){
        int extraHours;
        double salary;
        if(totalHoursWorked>40){
            extraHours = (int)(totalHoursWorked % 8);
            salary = (double)((getRatePerHour()*(getTotalHoursWorked()-extraHours))+(extraHours*1.5*getRatePerHour()));
        }
        else{
            salary = (double)(getRatePerHour()*getTotalHoursWorked());

        }
        return salary;
    }
         
    public void displayInfo(){
        System.out.println("Employee ID: " + getEmpID()+
        					"\nEmployee Name: " + getEmpName() + 
        					"\nDate hired: " + getEmpDateHired() + 
        					"\nDate of birth: "+ getEmpBirthDate() + 
        					"\nHours worked: " + getTotalHoursWorked() +
							"\nRate per hour: " + getRatePerHour() + 
        					"\nSalary: " + computeSalary());

    }
    
//    @override
    public String toString() {
    	return "Employee ID: " + String.valueOf(getEmpID())+
    			"\nEmployee Name: " + getEmpName() + 
    			"\nDate hired: "+ String.valueOf(getEmpDateHired()) + 
    			"\nDate of birth: " + String.valueOf(getEmpBirthDate())+
				"\nHours worked: " + String.valueOf(getTotalHoursWorked()) +
				"\nRate per hour: " + String.valueOf(getRatePerHour()) + 
				"\nSalary: " + String.valueOf(computeSalary());
    }
    
}
