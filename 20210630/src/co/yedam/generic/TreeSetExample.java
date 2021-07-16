package co.yedam.generic;

import java.util.TreeSet;

class Member implements Comparable<Member> {
	int memberNo;
	String memberName;
	public Member(int memberNo, String memberName) {
		this.memberNo = memberNo;
		this.memberName = memberName;
	}
	@Override
	public int compareTo(Member o) {
		// a<b<c
//		return this.memberNo - o.memberNo;  //3-5= -2 =>오름차순으로 정렬
//		if(this.memberNo > o.memberNo)
//			return -1;
//		else if (this.memberNo == o.memberNo) 
//			return 0;
//		else
//			return 1;
		if(this.memberName.compareTo(o.memberName) == 0) {
			return this.memberNo - o.memberNo; 
		}
		return this.memberName.compareTo(o.memberName); // -1 0 1
			
	}
	
}

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Member> members = new TreeSet<Member>();
		members.add(new Member(1001,"Hong"));
		members.add(new Member(1002,"Choi"));
		members.add(new Member(1003,"Kim"));
		members.add(new Member(1004,"Hong"));

		while(!members.isEmpty()) {
			Member mem = members.pollFirst();
			System.out.println(mem.memberNo+","+mem.memberName);
		}
		
		System.out.println();
		System.out.println("String.compareTo: "+"Park".compareTo("Hong"));


		TreeSet<Integer> set = new TreeSet<>();
		set.add(10); // Integer, new Integer(10)
		set.add(5);
		set.add(13);

		set.first(); //가장작은값
		set.last();

		while (!set.isEmpty()) {  //
			Integer v = set.pollFirst(); //작은값부터 하나씩 추출
			System.out.println(v);
		}
		System.out.println("end.");

	}

}