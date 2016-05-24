package Maventest.Maventest;

public class Greeter {
	
	public void login(Account guest){
		System.out.println(getLoginMessage(guest));
	}
	private String getLoginMessage(Account guest){
		switch (guest.getCountry()){
		case JAPAN:
			return String.format("こんにちわ, %sさん", guest.getName());
		case FRANCE:
			return String.format("Bonjour, %s.", guest.getName());
		case USA:
			default:
			return String.format("Hello, %s.", guest.getName());
		}
		
	}
	public void logout(Account guest){
		System.out.println(getLogoutMessage(guest));
	}
	private String getLogoutMessage(Account guest){
		switch (guest.getCountry()){
		case JAPAN:
			return "さようなら";
		case FRANCE:
			return "Au revoir";
		case USA:
			default:
			return "Goodby";
		}
	}
}
