package Maventest.Maventest;

public class PrimeNumberCalculator {
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
