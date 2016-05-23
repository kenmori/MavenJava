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
			System.out.println(Message.HOLIDAYS);
		} else if(weekday == Weekday.FRIDAY){
			System.out.println(Message.FRIDAY);
		} else {
			System.out.println(Message.WEEKDAYS);
		}
	}

}
