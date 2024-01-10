package employee.version5;
import java.util.ArrayList;
	
	public class EmployeeRoster {
		private int count;
		private ArrayList<Employee> empList;
		
		public EmployeeRoster() {
			this.empList = new ArrayList<Employee>();
			this.count=0;
		};
		
	
	    public ArrayList<Employee> getEmpList() {
	        return empList;
	    }
	    
	    
		public void setEmpList(ArrayList<Employee> empList) {
			this.empList = empList;
		}	
	
		
		boolean addEmployee(Employee e) {
			boolean res;
			empList.add(e);
			res = true;
			this.count++;
			return res;
		}
		
	
		Employee deleteEmployee(int searchID) {
			int i;
			Employee ret=null;
			for(i=0; i<empList.size() && empList.get(i).getEmpID()!=searchID; i++) {}
			if(i>=count) {
				System.out.println("ID not in array");
			}
			else {
				ret = this.empList.get(i);
				for(int x = i; x<this.empList.size()-1; x++) {
					this.empList.set(i, this.empList.get(i));
				}
				this.count--;
			}
			return ret;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		
		public EmployeeRoster searchEmployee(String name) {
			EmployeeRoster empResults = new EmployeeRoster();
						
			for(Employee employee: this.empList) {
				if(employee.getEmpName().toString().contains(name)){
					empResults.addEmployee(employee);
				}
			}
			
			return empResults;
		}
		
		public boolean updateEmployee(int id, Name name) {
			boolean res = false;
			for(Employee employee: this.empList) {
				if(employee.getEmpID()==id) {
					employee.setEmpName(name);
					res = true;

				}
			}
			return res;
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
		
	

		
		public int countHE() {
			int ctr = 0;
			
			for(int i = 0; i<this.count; i++) {			
				if(this.empList.get(i).getClass().getSimpleName().equals("HourlyEmployee")) {
					ctr++;
				}
			}
			return ctr;
		}
		
		public int countBPCE() {
			int ctr = 0;
			
			for(int i = 0; i<this.count; i++) {			
				if(this.empList.get(i).getClass().getSimpleName().equals("BasePlusCommissionEmployee")) {
					ctr++;
				}
			}
			return ctr;
		}
				
		public int countCE() {
			int ctr = 0;
			
			for(int i = 0; i<this.count; i++) {			
				if(this.empList.get(i).getClass().getSimpleName().equals("CommissionEmployee")) {
					ctr++;
				}
			}
			return ctr;
		}
		
		public int countPWE() {
			int ctr = 0;
			
			for(int i = 0; i<this.count; i++) {			
				if(this.empList.get(i).getClass().getSimpleName().equals("PieceWorkerEmployee")) {
					ctr++;
				}
			}
			return ctr;
		}
		
		public void displayHE(){
			for(int i = 0; i<this.count; i++) {			
				if(this.empList.get(i).getClass().getSimpleName().equals("HourlyEmployee")) {
					printOne(this.empList.get(i));

				}
			}
		}

		public void displayBPCE() {		
			for(int i = 0; i<this.count; i++) {			
				if(this.empList.get(i).getClass().getSimpleName().equals("BasePlusCommissionEmployee")) {
					printOne(this.empList.get(i));

				}
			}
		}

		public void displayCE() {
			for(int i = 0; i<this.count; i++) {			
				if(this.empList.get(i).getClass().getSimpleName().equals("CommissionEmployee")) {
					printOne(this.empList.get(i));

				}
			}
		}
		
		public void displayPWE() {
			for(int i = 0; i<this.count; i++) {			
				if(this.empList.get(i).getClass().getSimpleName().equals("PieceWorkerEmployee")) {
					printOne(this.empList.get(i));
				}
			}
		}
		

		void displayAllEmployee(){
			int i;
			System.out.format("|%-7s|%-30s|%-30s|%-10s\n", "ID", "NAME", "TYPE", "SALARY");
			for(i=0; i<this.count; i++) {
				printOne(this.empList.get(i));
			}
		}
		
		public void displayEmployee(String type) {
			for(int i = 0; i<this.count; i++) {			
				if(this.empList.get(i).getClass().getSimpleName().equals(type)) {
					printOne(this.empList.get(i));
				}
			}		
		}
		
		public void printOne(Employee e) {
			System.out.format("|%-7d|%-30s|%-30s|%-10.2f\n", e.getEmpID(), e.getEmpName(), e.getClass().getSimpleName(), this.computeEmployeeSalary(e));
		}
		
	}
