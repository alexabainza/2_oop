/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;


public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private float ratePerHour;
        
    public HourlyEmployee() {
    	
    }
    
    HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate, float totalHoursWorked, float ratePerHour){
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate){
        super(empID, empName, empDateHired, empBirthDate);
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
        System.out.println("\nTotal hours worked: " + getTotalHoursWorked()+
        		"\nRate per hour: " + getRatePerHour() + 
        		"\nSalary: " + computeSalary());
    }
//    @override
    public String toString() {
    	return super.toString() + 
				"\nHours worked: " + String.valueOf(getTotalHoursWorked()) +
				"\nRate per hour: " + String.valueOf(getRatePerHour()) + 
				"\nSalary: " + String.valueOf(computeSalary());
    }
    
}
