package employee.version3;


public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private float ratePerPiece;
        
    PieceWorkerEmployee(){
    	
    }
    
    PieceWorkerEmployee(int empID, String fName, String mName, String lName, String suffix, String title, String empDateHired, String empBirthDate,  int totalPiecesFinished, float ratePerPiece){
    	super(empID, fName, mName, lName, suffix, title, empDateHired, empBirthDate);
        this.ratePerPiece = ratePerPiece;
        this.totalPiecesFinished = totalPiecesFinished;
    }
    
    PieceWorkerEmployee(int empID, String fName, String mName, String lName, String suffix, String title, String empDateHired, String empBirthDate){
    	super(empID, fName, mName, lName, suffix, title, empDateHired, empBirthDate);
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
        	super.displayInfo();
        	System.out.println("Number of pieces finished: " + gettotalPiecesFinished() +
				"\nRate per piece: " + getRatePerPiece() +
				"\nSalary: " + computeSalary());    
        }
    
    public String toString() {
    	return super.toString() +     			
			"\nNumber of pieces finished " + String.valueOf(gettotalPiecesFinished()) +
			"\nRate per piece: " + String.valueOf(getRatePerPiece()) +
			"\nSalary: " + String.valueOf(computeSalary());
    }
    
}
