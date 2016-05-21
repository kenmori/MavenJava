package Maventest.Maventest;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
    	printNumbers(PrimeNumberCalculator.calcTo(100));
    }
    //メソッドとして切り出し
    private static void printNumbers(List<Integer> numbers){
    	for (int number: numbers){
    		System.out.println(number);
    	}
	}
}
