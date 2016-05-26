package Maventest.Maventest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ListMain {
	public static void main(String[] args){
		//実際使うときには特定の型の要素(インスタンス)「専用」にする。
		//このことをバインドするという。
		//Listインターフェイス,ArrayListクラスにそれぞれString型をバインドしていてこれによりこの
		//リストにはString型以外の要素を格納できなくなる
		//2箇所にでてくる右辺のダイアモンド演算子として省略できるe.g.<>
		//javaではジェネリック型には任意のクラスやインターフェイスをバインドできるが
		//プリミティブ型(eg.int)にバインドすることはできない
		//List<int> numbers = new ArrayList<>();x
		//List<Integer> numbers = new ArrayList<>();o この場合int型のラッパークラスであるInteger型をバインドする
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		System.out.println(fruits);
		
		//ジェネリック同士のバインド
		List<List<String>> listOfList = new ArrayList<List<String>>();
		List<String> list = new ArrayList<String>();
		listOfList.add(list);
		System.out.println(listOfList);//[[]]
		//Error List<List<String>> listOfList = new Array<ArrayList<String>>(); 
		//バインドする型を完全に合わせることが原則
		
		//イテレータ
		for(String fruit : fruits){
			System.out.println(fruit);
		}
		//上記と等価
		//特定の条件を満たす要素を削除する場合などの際下記のようにイテレータを直接扱う必要がある
//		Iterator<String> i = fruits.iterator();
//		while(i.hasNext()){
//			String fruit = i.next();
//			System.out.println(fruit);
//			if(fruit.length() == 5){
//				i.remove();
//			}
//		}
		
		//Collections
		Collections.sort(fruits);
		System.out.println(fruits);
		//[apple, banana, orange]
		
		//Comparator
		Collections.sort(fruits, new Comparator<String>(){
			//@Override
			public int compare(String o1, String o2){
				return o2.compareTo(o1);
			}
		});
		System.out.println(fruits);//[orange, banana, apple]
	}
}
