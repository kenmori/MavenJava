package Maventest.Maventest;
import java.util.*;

public class App
{
    public static void main( String[] args ){
      Item pencil = new Item("umi-hb-001", "umi HB", "四菱鉛筆", 120);
      Item noteBook = new Item("cbs-a4-b", "CAMBUS,A4 B", "CAMBUS", 150);

      //商品を表示
      System.out.println("商品");

      //鉛筆
      System.out.println("商品コード: " + pencil.getCode());
      System.out.println("商品名: " + pencil.getName());
      System.out.println("メーカー: " + pencil.getMaker());
      System.out.println("価格: " + pencil.getPrice() + "円");
      System.out.println();

      //ノート
      System.out.println("商品コード: " + noteBook.getCode());
      System.out.println("商品名: " + noteBook.getName());
      System.out.println("メーカー: " + noteBook.getMaker());
      System.out.println("価格: " + noteBook.getPrice() + "円");
	}
}
