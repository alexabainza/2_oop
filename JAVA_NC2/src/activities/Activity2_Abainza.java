package activities;

public class Activity2_Abainza {

	static String country = "Philippines";
	String name;
	int age;
	String gender;
	
	public static void main(String[] args) {
		String occupation = "Student";
		
		Activity2_Abainza studDetails = new Activity2_Abainza();
		
		studDetails.name = "Alex";
		studDetails.age = 21;
		studDetails.gender = "Female";
		
		System.out.println("Personal Information:\nName: " 
		+ studDetails.name + "\nAge: " + studDetails.age
		+ "\nGender: " + studDetails.gender 
		+ "\nCountry: " + country
		+ "\nOccupation: " + occupation);
	
	}

}

