package activities;
import java.util.Scanner;

public class Activity6_Abainza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your birth month");
		int birthMonth = scanner.nextInt();
		
		System.out.println("Enter your birth date: ");
		int birthDate = scanner.nextInt();

		
		String zodiac = findZodiac(birthMonth, birthDate);
		System.out.printf("Birthday: %d/%d\tSign: %s", birthMonth, birthDate, zodiac);
		// TODO Auto-generated method stub

	}
	
	private static String findZodiac(int birthMonth, int birthDate) {
		String sign = "\0";
		//check if date is valid
		if((birthMonth<=12 && birthMonth>0) && (birthDate>0  && birthDate<=31)) {
			if ((birthMonth == 3 && birthDate >= 21) || (birthMonth == 4 && birthDate <= 19)) {
	            sign =  "Aries";
	        } else if ((birthMonth == 4 && birthDate >= 20) || (birthMonth == 5 && birthDate <= 20)) {
	            sign =  "Taurus";
	        } else if ((birthMonth == 5 && birthDate >= 21) || (birthMonth == 6 && birthDate <= 20)) {
	            sign =  "Gemini";
	        } else if ((birthMonth == 6 && birthDate >= 21) || (birthMonth == 7 && birthDate <= 22)) {
	            sign =  "Cancer";
	        } else if ((birthMonth == 7 && birthDate >= 23) || (birthMonth == 8 && birthDate <= 22)) {
	            sign =  "Leo";
	        } else if ((birthMonth == 8 && birthDate >= 23) || (birthMonth == 9 && birthDate <= 22)) {
	            sign =  "Virgo";
	        } else if ((birthMonth == 9 && birthDate >= 23) || (birthMonth == 10 && birthDate <= 22)) {
	            sign =  "Libra";
	        } else if ((birthMonth == 10 && birthDate >= 23) || (birthMonth == 11 && birthDate <= 21)) {
	            sign =  "Scorpio";
	        } else if ((birthMonth == 11 && birthDate >= 22) || (birthMonth == 12 && birthDate <= 21)) {
	            sign =  "Sagittarius";
	        } else if ((birthMonth == 12 && birthDate >= 22) || (birthMonth == 1 && birthDate <= 19)) {
	            sign =  "Capricorn";
	        } else if ((birthMonth == 1 && birthDate >= 20) || (birthMonth == 2 && birthDate <= 18)) {
	            sign =  "Aquarius";
	        } else {
	            sign =  "Pisces";
	        }
		}
		else {
			System.out.println("Ivalid date");
		}
		return sign;
	}
}
