package employee.version3;

public class TestMain {

    public static void main(String[] args) {
      
      HourlyEmployee detailsHE = new HourlyEmployee(1234, "Alex","Ruba", "Abainza","", "",  "2023/10/12", "2001/12/10" , 45, 10);
      System.out.println(detailsHE.toString());
      detailsHE.displayInfo();

//      PieceWorkerEmployee detailsPWE = new PieceWorkerEmployee(1234, "Alex","Ruba", "Abainza","", "",  "2023/10/12", "2001/12/10" , 500, 10);
//      System.out.println(detailsPWE.toString());
//    detailsPWE.displayInfo();
//      CommissionEmployee detailsCE = new CommissionEmployee(1234, "Alex","Ruba", "Abainza","", "",  "2023/10/12", "2001/12/10" , 100000);
//      System.out.println(detailsCE.getEmpID());
//      BasePlusCommissionEmployee detailsBCPE = new BasePlusCommissionEmployee(1234, "Alex","Ruba", "Abainza","", "",  "2023/10/12", "2001/12/10" , 100000, 20000);
//      String hehe = detailsBCPE.toString();
//      System.out.println(hehe);
    }
}