package _10_Generic;

import java.util.ArrayList;
import java.util.List;

interface Eatable { }
class Fruit<T extends Fruit & Eatable> implements Eatable {
	List<T> list = new ArrayList<T>();
	
}
class Apple extends Fruit {}
class Grape extends Fruit {}
class GreenApple extends Apple {}
class GreenGrape extends Grape {}
class Beef implements Eatable {}
class Toy {}


public class Restricted_Generic {
	public static void main(String[] args) {
		
		Fruit<Fruit> fru0 = new Fruit<Fruit>();
		Fruit<Apple> fru1 = new Fruit<Apple>();
		Fruit<GreenApple> fru2 = new Fruit<GreenApple>();
		Fruit<Grape> fru3 = new Fruit<Grape>();
		Fruit<GreenGrape> fru4 = new Fruit<GreenGrape>();
//		Fruit<Beef> fu5 = new Fruit<Beef>();
//		Fruit<Toy> fru5 = new Fruit<Toy>();
//		Fruit<Object> fru6 = new Fruit<Object>();
	}

}
