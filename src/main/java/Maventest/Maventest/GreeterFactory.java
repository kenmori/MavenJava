package Maventest.Maventest;

public class GreeterFactory {
	public static Greeter getGreeter(Account guest){
		switch (guest.getCountry()){
		case JAPAN:
			return new JapaneseGreeter();
		case FRANCE:
			return new FrenchGreeter();
		case USA:
			default:
			return new EnglishGreeter();
		}
		
	}
}
