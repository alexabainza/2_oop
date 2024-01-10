package DiscountSystem;

public class DiscountRate {
	private Visit cust;
	
	public DiscountRate(Visit cust) {
		this.cust = cust;
	}
	public Visit getCust() {
		return cust;
	}
	
	public void setCust(Visit cust) {
		this.cust = cust;
	}
	
	public double getServiceDiscount() {
		String type = this.cust.getCust().getMemberType().toLowerCase();
		double discount;
		switch(type) {
		case "premium":
			discount = 0.2f;
			break;
		case "gold":
			discount = 0.15f;
			break;
		case "silver":
			discount = 0.1f;
			break;
		default:
			discount = 0f;
		}
		return discount;
	}

	public double getProductDiscount() {
		String type = this.cust.getCust().getMemberType().toLowerCase();
		double discount;
		switch(type) {
		case "premium":
			discount = 0.1f;
			break;
		case "gold":
			discount = 0.1f;
			break;
		case "silver":
			discount = 0.1f;
			break;
		default:
			discount = 0f;
		}
		return discount;
	}
	
	public void display() {
		System.out.printf("You have a service discount of %.2f and product discount of %.2f", getServiceDiscount(), getProductDiscount());
	}

}
