package Maventest.Maventest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account guest = new Account(args[0], Country.valueOf(args[1]));
		Greeter greeter = GreeterFactory.getGreeter(guest);
		greeter.login(guest);
		greeter.logout(guest);
	}
	

}
