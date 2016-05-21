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
        	 * 1.このブロックで使われている変数を全て抜き出す
        	 * 2.変数の宣言箇所をみる。
        	 * 宣言がコンテキストの外側宣言→引数として渡す
        	 * 
        	 * */
    		//機能的なメソッドの中から数学的なメソッドを別クラスのメソッドとして切り出す
    		//切り出したclassからのアクセスにする
    		if(PrimeNumberCalculator.isPrimeNumber(testNumber)){
        		System.out.println(testNumber);
        	}
    		//System.out.println("sayHello");
    		sayHello();
    	}
    }
    //メソッドとして切り出し
    private static void sayHello(){
		System.out.println("sayHello");
	}
}
