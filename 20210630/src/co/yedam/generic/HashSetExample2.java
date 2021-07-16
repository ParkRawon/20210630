package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Apple {
	String group;
	int price;

	Apple(String group, int price) {
		this.price = price;
		this.group = group;
	}
	@Override
	public int hashCode() {
		return this.group.hashCode() + this.price; //동일한 종류, 동일한 가격
	}
	@Override
	public boolean equals(Object obj) {
		Apple other = (Apple)obj;
		return this.group.equals(other.group) && this.price == other.price;  //동일한 가격,값 /첫번째 값와 두번째 값을 비교 
		
	}
}

public class HashSetExample2 {
	public static void main(String[] args) {
		// Set: 중복된 값을 허용하지 않음.
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("부사",1000));
		set.add(new Apple("부사",1000));
		set.add(new Apple("부사",1500));
		set.add(new Apple("아오리",1000));

		Iterator<Apple> iter = set.iterator();
		while(iter.hasNext()) {
			Apple app = iter.next();
			System.out.println("종류: "+app.group+", 가격: "+app.price);
		}

	}

}