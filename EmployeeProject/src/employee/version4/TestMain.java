package employee.version4;

public class TestMain {
	
    public static void main(String[] args) {
    	//for count
    	
    	EmployeeRoster emp = new EmployeeRoster();

        HourlyEmployee he1 = new HourlyEmployee(1234, "Alex","Ruba", "Abainza","", "",  "2023/10/12", "2001/5/10" , 34, 24);
        HourlyEmployee he2 = new HourlyEmployee(1235, "Rhuther","Pak", "Cugtas","", "",  "2023/10/12", "2000/7/10" , 45, 10);
        HourlyEmployee he3 = new HourlyEmployee(1236, "Roj","Serge", "Urbs","", "",  "2021/12/6", "1993/5/12" , 54, 10);
        HourlyEmployee he4 = new HourlyEmployee(1237, "MG","Tand", "Hong","", "",  "2022/7/18", "1998/6/13" , 25, 15);
        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(1238, "Grace","Esh", "Tand","", "",  "2020/7/12", "1996/5/13" , 52, 10);
        CommissionEmployee ce1 = new CommissionEmployee(1239, "Zaliks","Mor", "Enrgy","", "",  "2023/3/15", "2001/12/4" , 100000);

        BasePlusCommissionEmployee bcpe1 = new BasePlusCommissionEmployee(1240, "Peter","Ent", "Est","", "",  "2023/10/12", "2001/12/10" , 360000, 21000);
        BasePlusCommissionEmployee bcpe2 = new BasePlusCommissionEmployee(1241, "Juls","Parl", "West","", "",  "2023/10/12", "2001/12/10" , 250000, 20000);


    	emp.addEmployee(pwe1);
    	emp.addEmployee(he2);

    	emp.addEmployee(ce1);
    	emp.addEmployee(he1);
    	emp.addEmployee(bcpe2);
    	emp.addEmployee(he3);
    	emp.addEmployee(he4);
    	emp.addEmployee(bcpe1);
    	emp.displayAllEmployee();
    	
    	Employee del = new Employee();
    	del = emp.deleteEmployee(1235);
    	del.displayInfo();
    	
    	EmployeeRoster findName = new EmployeeRoster();
    	findName = emp.searchEmployee("Tand");
    	findName.displayAllEmployee();

    	Name changeName = new Name("Grays", "Robs", "Taur", "", "");
    	emp.updateEmployee(1241, changeName);

    	emp.displayAllEmployee();
    	
//    	emp.displayBPCE();
//    	emp.displayCE();
//    	emp.displayHE();
//    	emp.displayPWE();
    	
    	emp.displayEmployee("HourlyEmployee");
    	
    	System.out.format("\nCount is %d", emp.getCount());
    }
}