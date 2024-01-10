package employee.version4;

public class EmployeeRoster {
	private int count;
	private int max;
	private Employee[] empList;
	
	
	public EmployeeRoster() {
		this.max = 100;
		this.count = 0;
		this.empList = new Employee[this.max];
	};
	
	public EmployeeRoster(int max) {
		this.max = max;
		this.count = 0;
		this.empList = new Employee[this.max];
	}
	
	//---
	
	public Employee[] getEmpList() {
		return empList;
	}
	
	public Employee[] getEmployeeList() {
		return this.empList;
				}
	
	
	public int getCount() {
		return this.count;
	}
	
	
	public int getMax() {
		return this.max;
	}

	
	public boolean addEmployee(Employee e) {
		boolean res = false;
		if(this.count<this.max) {
			this.empList[this.count] = e;
			this.count++;
			res = true;
			System.out.println(e.getClass().getSimpleName());
		}
		else {
			System.out.println("Roster full!");
		}
		return res;
	}
	

	Employee deleteEmployee(int searchID) {
		int i;
		Employee ret=null;
		for(i=0; i<this.count && empList[i].getEmpID()!=searchID; i++) {}
		if(i>=count) {
			System.out.println("ID not in array");
		}
		else {
			ret = empList[i];
			for(int x = i; x<count; x++) {
				empList[x] = empList[x+1];
			}
			this.count--;
		}
		return ret;
	}
	
	private double computeEmployeeSalary(Employee e) {
		double salary = 0.0;
		String type = e.getClass().getSimpleName();
	
		switch(type) {
		case "HourlyEmployee":
			HourlyEmployee he = new HourlyEmployee();
			he = (HourlyEmployee)e;
			salary = he.computeSalary();
			break;

		case "BasePlusCommissionEmployee":
			BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee();
			bpce = (BasePlusCommissionEmployee)e;
			salary = bpce.computeSalary();
			break;
		
		case "PieceWorkerEmployee":
			PieceWorkerEmployee pwe = new PieceWorkerEmployee();
			pwe = (PieceWorkerEmployee)e;
			salary = pwe.computeSalary();
			break;

		case "CommissionEmployee":
			CommissionEmployee ce = new CommissionEmployee();
			ce = (CommissionEmployee)e;
			salary = ce.computeSalary();
			break;
		}

		return salary;
	}
	
	public EmployeeRoster searchEmployee(String name) {
		EmployeeRoster empResults = new EmployeeRoster();
		
		int i;
		for(i=0; i<this.count; i++) {
			if(this.empList[i].getEmpName().toString().contains(name)) {
				empResults.addEmployee(this.empList[i]);
			}
		}
		
		return empResults;
	}
	
	public boolean updateEmployee(int id, Name name) {
		boolean res = false;
		int i;
		for(i=0; i<this.count; i++) {
			if(empList[i].getEmpID()==id) {
				this.empList[i].setEmpName(name);
				res = true;
			}
		}
		return res;
	}
	
	
	public int countHE() {
		int ctr = 0;
		
		for(int i = 0; i<this.count; i++) {			
			if(this.empList[i].getClass().getSimpleName().equals("HourlyEmployee")) {
				ctr++;
			}
		}
		return ctr;
	}
	
	public int countBPCE() {
		int ctr = 0;
		
		for(int i = 0; i<this.count; i++) {			
			if(this.empList[i].getClass().getSimpleName().equals("BasePlusCommissionEmployee")) {
				ctr++;
			}
		}
		return ctr;
	}
			
	public int countCE() {
		int ctr = 0;
		
		for(int i = 0; i<this.count; i++) {			
			if(this.empList[i].getClass().getSimpleName().equals("CommissionEmployee")) {
				ctr++;
			}
		}
		return ctr;
	}
	
	public int countPWE() {
		int ctr = 0;
		
		for(int i = 0; i<this.count; i++) {			
			if(this.empList[i].getClass().getSimpleName().equals("PieceWorkerEmployee")) {
				ctr++;
			}
		}
		return ctr;
	}
	
	public void displayHE(){
		for(int i = 0; i<this.count; i++) {			
			if(this.empList[i].getClass().getSimpleName().equals("HourlyEmployee")) {
				printOne(this.empList[i]);

			}
		}
	}

	public void displayBPCE() {		
		for(int i = 0; i<this.count; i++) {			
			if(this.empList[i].getClass().getSimpleName().equals("BasePlusCommissionEmployee")) {
				printOne(this.empList[i]);

			}
		}
	}

	public void displayCE() {
		for(int i = 0; i<this.count; i++) {			
			if(this.empList[i].getClass().getSimpleName().equals("CommissionEmployee")) {
				printOne(this.empList[i]);

			}
		}
	}
	
	public void displayPWE() {
		for(int i = 0; i<this.count; i++) {			
			if(this.empList[i].getClass().getSimpleName().equals("PieceWorkerEmployee")) {
				printOne(this.empList[i]);
			}
		}
	}
	

	void displayAllEmployee(){
		int i;
		System.out.format("|%-7s|%-30s|%-30s|%-10s\n", "ID", "NAME", "TYPE", "SALARY");
		for(i=0; i<this.count; i++) {
			printOne(this.empList[i]);
		}
	}
	
	public void displayEmployee(String type) {
		for(int i = 0; i<this.count; i++) {			
			if(this.empList[i].getClass().getSimpleName().equals(type)) {
				printOne(this.empList[i]);
			}
		}		
	}
	
	public void printOne(Employee e) {
		System.out.format("|%-7d|%-30s|%-30s|%-10.2f\n", e.getEmpID(), e.getEmpName(), e.getClass().getSimpleName(), this.computeEmployeeSalary(e));
	}
	
}
