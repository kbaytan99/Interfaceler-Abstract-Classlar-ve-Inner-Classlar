package interfaceRealLife;

public class Main {

	public static void main(String[] args) {

		signUpManager snup = new signUpManager(new AgeUserCheckService());
		snup.signUp(new User(1, "Kaan", 16));
		snup.signUp(new User(2, "Kaan1", 18));
		snup.signUp(new User(3, "Kaan2", 14));
		snup.signUp(new User(4, "Kaan3", 6));
		snup.signUp(new User(5, "Kaan4", 42));
		snup.signUp(new User(6, "Kaan5", 21));
		snup.signUp(new User(7, "Kaan6", 17));
		snup.signUp(new User(8, "Kaan7", 86));
		snup.signUp(new User(9, "Kaan8", 16));
		snup.signUp(new User(0, "Kaan9", 26));

	}
}
