package employee.version1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PieceWorkerEmployee {
	private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;
    

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d", Locale.US); 
    
    PieceWorkerEmployee(){
    	
    }
    
    PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate,  int totalPiecesFinished, float ratePerPiece){
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired, formatter);
        this.empBirthDate = LocalDate.parse(empBirthDate, formatter);
        this.ratePerPiece = ratePerPiece;
        this.totalPiecesFinished = totalPiecesFinished;
    }
    
    PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate){
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

    public int gettotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void settotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
    	int numHundred;
    	double salary;
    	if(totalPiecesFinished>100) {
    		numHundred = (int)totalPiecesFinished/100;
    		salary = (totalPiecesFinished * ratePerPiece) + (numHundred*10*ratePerPiece);
    	}
    	else {
    		salary = totalPiecesFinished * ratePerPiece;
    	}
    	return salary;
    }
         
    
    public void displayInfo(){
        System.out.println("Employee ID: " + getEmpID()+
				"\nEmployee Name: " + getEmpName() + 
				"\nDate hired: " + getEmpDateHired() + 
				"\nDate of birth: "+ getEmpBirthDate() + 
				"\nNumber of pieces finished " + gettotalPiecesFinished() +
				"\nRate per piece: " + getRatePerPiece() + 
				"\nSalary: " + computeSalary());
    
    }
    
    public String toString() {
    	return "Employee ID: " + String.valueOf(getEmpID())+
    			"\nEmployee Name: " + getEmpName() + 
    			"\nDate hired: "+ String.valueOf(getEmpDateHired()) + 
    			"\nDate of birth: " + String.valueOf(getEmpBirthDate())+
				"\nTotal pieces finished: " + String.valueOf(gettotalPiecesFinished()) +
				"\nRate per piece: " + String.valueOf(getRatePerPiece()) + 
				"\nSalary: " + String.valueOf(computeSalary());
    }    
}
