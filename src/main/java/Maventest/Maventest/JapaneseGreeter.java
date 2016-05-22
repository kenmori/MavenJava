package Maventest.Maventest;

public class JapaneseGreeter implements Greeter {
	public void login(Account guest){
		System.out.println(String.format(
				"こんにちは", guest.getName()
		));
	}
	public void logout(Account guest){
		System.out.println(String.format(
				"さようなら", guest.getName()
		));
	}
}
