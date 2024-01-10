/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d", Locale.US); 
    
    public HourlyEmployee() {
    }
//    
    public HourlyEmployee(int empID, String fName, String mName, String lName, String suffix, String title, String empDateHired, String empBirthDate, float totalHoursWorked, float ratePerHour) {
    	super(empID, fName, mName, lName, suffix, title, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String fName, String mName, String lName, String suffix, String title, String empDateHired, String empBirthDate){
    	super(empID, fName, mName, lName, suffix, title, empDateHired, empBirthDate);
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
    	super.displayInfo();
        System.out.println("Rate per hour: " + getRatePerHour() + 
                            "\nSalary: " + computeSalary());
    }
//    @override
    public String toString() {
    	return super.toString()+
				"\nHours worked: " + String.valueOf(getTotalHoursWorked()) +
				"\nRate per hour: " + String.valueOf(getRatePerHour()) + 
				"\nSalary: " + String.valueOf(computeSalary());
    }
    
}
