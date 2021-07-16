package co.yedam.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLisstExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("박라원");
		names.add("박하림");
		names.add("박하림");
		names.add("김지은");
		names.add(1, "이은지");
//		names.add(5,"박주현");  인덱스범위 내에서만 추가해야한다.
		names.remove(0); //() ->인덱스값
//		names.remove("박하림");
//		names.clear();
		
		System.out.println("크기" + names.size()); // java.lang.String

		for (int i = 0; i < names.size(); i++){
			System.out.println("i: " + i + ", name: " + names.get(i));
		}
		
		names = new LinkedList<String>();
		
	}

}
