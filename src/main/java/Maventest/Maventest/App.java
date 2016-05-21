package Maventest.Maventest;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	for (int testNumber = 2; testNumber <= 10; testNumber++){
    		/*素数(その数でしか割りきれない数字)かどうかを判定する*/
    		boolean isPrimeNumber = true;
    		for (int i = 2; i < testNumber; i++){
    			if(testNumber % i == 0){
    				isPrimeNumber = false;
    				break;
    			}
    		}
    		if (isPrimeNumber) {
    			System.out.println(testNumber);
    		}
    	}
    }
}
