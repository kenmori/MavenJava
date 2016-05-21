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
        	/*メソッドへの切り出し方
        	 * 変数の宣言箇所をみる。
        	 * 宣言がコンテキストの外側宣言→引数として渡す
        	 * 
        	 * */
    		if(isPrimeNumber(testNumber)){
        		System.out.println(testNumber);
        	}
    	}

    }
    private static boolean isPrimeNumber(int testNumber){
    	boolean isPrimeNumber = true;
   		for (int i = 2; i < testNumber; i++){
			if(testNumber % i == 0){
				isPrimeNumber = false;
				break;
			}
		}
    	return isPrimeNumber;
    }
}
