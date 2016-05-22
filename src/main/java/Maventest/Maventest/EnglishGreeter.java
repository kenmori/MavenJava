package Maventest.Maventest;
public class EnglishGreeter implements Greeter {
	public void login(Account guest){
		System.out.println(String.format(
				"Hello %s", guest.getName()
		));
	}
	public void logout(Account guest){
		System.out.println("Gooby");
	}
}
