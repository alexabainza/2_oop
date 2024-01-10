package employee.version1;

public class TestMain {

    public static void main(String[] args) {  
      HourlyEmployee detailsHE = new HourlyEmployee(1234, "Alex", "2023/10/12", "2001/12/10" , 45, 10);
      detailsHE.displayInfo();
      String hehehe = detailsHE.toString();
      System.out.println(hehehe);
      PieceWorkerEmployee detailsPWE = new PieceWorkerEmployee(1234, "Alex", "2023/10/12", "2001/12/10" , 500, 10);
      detailsPWE.displayInfo();
      CommissionEmployee detailsCE = new CommissionEmployee(1234, "Alex", "2023/10/12", "2001/12/10" , 100000);
      detailsCE.displayInfo();
      BasePlusCommissionEmployee detailsBCPE = new BasePlusCommissionEmployee(1234, "Alex", "2023/10/12", "2001/12/10" , 100000, 20000);
      String hehe = detailsBCPE.toString();
      System.out.println(hehe);
      
      
    }

}
