import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String[] students = new String[11];
		students[0] = "";
		students[1] = "Billy";
		students[2] = "Josh";
		students[3] = "Joe";
		students[4] = "Brianna";
		students[5] = "Libby";
		students[6] = "Amanda";
		students[7] = "Kate";
		students[8] = "Dave";
		students[9] = "Ricky";
		students[10] = "Greg";
		boolean goAgain;
		while(goAgain = true) {		
		System.out.print("Welcome to our Java class. Which student would you like to learn more about? ");
		int userNum = ValidatorMethods.getInt(scnr, "Enter a number 1-10:");
		boolean validInput;
				
		while(validInput = true) {
		if(userNum < 1 || userNum > 10) {
			validInput = false;
			System.out.print("That student does not exist. Please try again. ");
			userNum = ValidatorMethods.getInt(scnr, "Enter a number 1-10:");
		}else {
			validInput = true;
			System.out.println("Thank you, processing now...");
			System.out.println("");
			System.out.println("");
			break;
		}
		}
		String validUserNum = Integer.toString(userNum);
		String choiceSelect;
		if(validUserNum.equals("1")) {
			System.out.print("Student 1 is " + students[1] + ". What would you like to know about " + students[1] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[1] + "'s hobbies are gaming and music.");
			}else {
				System.out.println(students[1] + "'s favorite food is a good burger!");
			}
		}else if(validUserNum.equals("2")) {
			System.out.print("Student 2 is " + students[2] + ". What would you like to know about " + students[2] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[2] + "'s hobbies are anime and being sad.");
			}else {
				System.out.println(students[2] + "'s favorite food is sushi!");
			}
		}else if(validUserNum.equals("3")) {
			System.out.print("Student 3 is " + students[3] + ". What would you like to know about " + students[3] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[3] + "'s hobbies are watching movies and socializing.");
			}else {
				System.out.println(students[3] + "'s favorite food is steak done medium rare!");
			}
		}else if(validUserNum.equals("4")) {
			System.out.print("Student 4 is " + students[4] + ". What would you like to know about " + students[4] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[4] + "'s hobbies are playing hockey and fighting.");
			}else {
				System.out.println(students[4] + "'s favorite food is pountine!");
			}
		}else if(validUserNum.equals("5")) {
			System.out.print("Student 5 is " + students[5] + ". What would you like to know about " + students[5] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[5] + "'s hobbies are watching Nascar and driving fast.");
			}else {
				System.out.println(students[5] + "'s favorite food is a good burger!");
			}
		}else if(validUserNum.equals("6")) {
			System.out.print("Student 6 is " + students[6] + ". What would you like to know about " + students[6] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[6] + "'s hobbies are clubbing and drinking.");
			}else {
				System.out.println(students[6] + "'s favorite food is avocado toast!");
			}
		}else if(validUserNum.equals("7")) {
			System.out.print("Student 7 is " + students[7] + ". What would you like to know about " + students[7] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[7] + "'s hobbies are grilling and mowing the lawn.");
			}else {
				System.out.println(students[7] + "'s favorite food is a rare Wagyu steak!");
			}
		}else if(validUserNum.equals("8")) {
			System.out.print("Student 8 is " + students[8] + ". What would you like to know about " + students[8] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[8] + "'s hobbies are swimming and rock climbing.");
			}else {
				System.out.println(students[8] + "'s favorite food is tacos!");
			}
		}else if(validUserNum.equals("9")) {
			System.out.print("Student 9 is " + students[9] + ". What would you like to know about " + students[9] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[9] + "'s hobbies are ice skating and roller blading.");
			}else {
				System.out.println(students[9] + "'s favorite food is ice cream!");
			}
		}else {
			System.out.print("Student 10 is " + students[10] + ". What would you like to know about " + students[10] + "? ");
			choiceSelect = ValidatorMethods.getStringMatchingRegex(scnr, "(hobbies or favorite food).", "[Hh][Oo][Bb][Bb][Ii][Ee][Ss]||[Ff][Aa][Vv][Oo][Rr][Ii][Tt][Ee]\\s[Ff][Oo][Oo][Dd]");
			String lowerCase = choiceSelect.toLowerCase();
			if(choiceSelect.equals("hobbies")) {
				System.out.println(students[10] + "'s hobbies are watching Netflix and being angry on the internet.");
			}else {
				System.out.println(students[10] + "'s favorite food is the salty tears of people on the internet!");
			}
		}
		System.out.println("");
		goAgain = ValidatorMethods.getYesOrNo(scnr, "Would you like to learn about another student? yes/no");
		if(goAgain != true) {
			break;
		}
		}
		System.out.println("Thank you, goodbye!");
	}
	
}


