package Maventest.Maventest;

public class FrenchGreeter implements Greeter {
	public void login(Account guest){
		System.out.println(String.format(
				"Bonjor %s", guest.getName()
		));
	}
	public void logout(Account guest){
		System.out.println("Au revoir");
	}
}