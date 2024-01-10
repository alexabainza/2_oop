package DiscountSystem;

public class Customer {
	private String name;
	private boolean isMember;
	private String memberType;
	
	public Customer(String name) {
		this.name = name;
		this.isMember = false;
		this.memberType = ""; //sets to null
	}

	public Customer(String name, String memberType) {
		this.name = name;
		this.isMember = false;
		this.memberType = memberType;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "\tMember Type: " + getMemberType();
	}
}
