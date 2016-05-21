package Maventest.Maventest;
import java.util.*;

public class PrimeNumberCalculator {
	public static List<Integer> calcTo(int maxNumber){
		if(maxNumber < 2){
			return Collections.emptyList();
		}
		List<Integer> primeNumbers = new ArrayList();
		primeNumbers.add(2);
		for (int testNumber = 3; testNumber <= maxNumber; testNumber = testNumber + 2){
    		if(isPrimeNumber(testNumber)){
        		primeNumbers.add(testNumber);
        	}
    	}
		return primeNumbers;

	}
	//Appから呼べるようにpublicに変更
    public static boolean isPrimeNumber(int testNumber){
    	if(testNumber < 2){
    		return false;
    	} else if (testNumber == 2) {
    		return true;
    	} else if (testNumber % 2 == 0) {
    		return false;
    	}

   		for (int i = 3; i < testNumber; i = i + 2){
			if(testNumber % i == 0){
				return false;
			}
		}
    	return true;
    }
}
