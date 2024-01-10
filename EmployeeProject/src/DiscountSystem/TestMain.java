package DiscountSystem;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
			Customer newCust = new Customer("Alex", "gold");
			System.out.println(newCust.toString());
//			sysoutnewCust.toString();
			
			Visit visit = new Visit(newCust, 2000, 3000);
			DiscountRate dr = new DiscountRate(visit);
			dr.display();
			System.out.println(visit.toString());
			

			
			
			
		}

	}

