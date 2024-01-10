package DiscountSystem;
import java.time.LocalDate;

public class Visit {
	private Customer cust;
	private LocalDate dateVisit;
	private double serviceExpense;
	private double productExpense;
	
	LocalDate visit = LocalDate.now();
	
	public Visit(String name) {
		this.cust = new Customer(name);
		this.dateVisit = visit;		
		// TODO Auto-generated constructor stub
	}
	
	public Visit(String name, String memberType, double serviceExpense, double productExpense) {
		this.cust = new Customer(name, memberType);
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
	}
	public Visit(Customer cust, double serviceExpense, double productExpense) {
		this.cust = cust;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
	}
	
	
	public double getProductExpense() {
		return productExpense;
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}
	
	public Customer getCust() {
		return cust;
	}
	
	public LocalDate getDateVisit() {
		return dateVisit;
	}
	
	public LocalDate getVisit() {
		return visit;
	}
	
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	public void setDateVisit(LocalDate dateVisit) {
		this.dateVisit = dateVisit;
	}
	
	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	public void setVisit(LocalDate visit) {
		this.visit = visit;
	}
	
	public double totalExpenses() {
		Visit feefol = new Visit(this.cust, getServiceExpense(), getProductExpense());
		DiscountRate rate = new DiscountRate(feefol);
		
		double prodDisc = rate.getProductDiscount();
		double serDisc = rate.getServiceDiscount();
		double total = (getServiceExpense()-(getServiceExpense()*serDisc)) + (getProductExpense() - (getProductExpense()*prodDisc));
		
		return total;
	}
	
	@Override
	public String toString() {
		return getCust().toString() + "\nProduct expense: " + getProductExpense() +
				"\nService expenses: " + getServiceExpense() +
				"\nTotal Expenses: " + totalExpenses();
	}
	
	
	
}
