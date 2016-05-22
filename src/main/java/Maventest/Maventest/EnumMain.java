package Maventest.Maventest;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weekday weekday = Weekday.FRIDAY;
		System.out.println(weekday);
		greet(weekday);
	}
	public static void greet(Weekday weekday){
		if(weekday == Weekday.SUNDAY || weekday == Weekday.SATURDAY){
			System.out.println("羽をのばしましょう");
		} else {
			System.out.println("今日は平日です");
		}
	}

}
