package Maventest.Maventest;
import java.util.*;

public class PrimeNumberCalculator {
	public static List<Integer> calcTo(int maxNumber){
		List<Integer> primeNumbers = new ArrayList();
		for (int testNumber = 2; testNumber <= maxNumber; testNumber++){
    		if(isPrimeNumber(testNumber)){
        		primeNumbers.add(testNumber);
        	}
    	}
		return primeNumbers;
	
	}
	//Appから呼べるようにpublicに変更
    public static boolean isPrimeNumber(int testNumber){
   		for (int i = 2; i < testNumber; i++){
			if(testNumber % i == 0){
				return false;
			}
		}
    	return true;
    }
}
