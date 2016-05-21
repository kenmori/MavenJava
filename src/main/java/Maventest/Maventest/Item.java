package Maventest.Maventest;

public class Item {
    private final String code;
    private final String name;
    private final String maker;
    private final int price;
    public Item (String code, String name, String maker, int price){
      super();
      this.code = code;
      this.name = name;
      this.maker = maker;
      this.price = price;
    }
    public String getCode() {
    	return code;
    }
    public String getName() {
    	return name;
    }
    public String getMaker() {
    	return maker;
    }
    public int getPrice() {
    	return price;
    }
}
