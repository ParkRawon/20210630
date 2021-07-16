package co.yedam.exercise;

import co.yedam.pilates.Gender;
import co.yedam.pilates.Member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMemberId(101);
		m1.setMemberName("Park");
		m1.setMemberPhone("010");
		System.out.println(m1.getMemberId() + "," + m1.getMemberName()+ ","+m1.getMemberPhone());
		Member m2 = new Member(102, "Choi","0101234","1029",Gender.WOMEN);
		System.out.println(m2.getMemberId());
		Member m3 = new Member(103, "Hong","0105678");
		System.out.println(m3.getMemberId() + "," + m3.getMemberName());
		
		Member[] members = new Member[5];
		members[0] = m1;
		members[1] = m2;
		members[2] = m3;
		members[3] = null;
		members[4] = null;
		
		//¸®½ºÆ®.
		for (int i = 0; i<members.length; i++) {
		if(members[i] != null) {
			System.out.println(members[i].getMemberId()+","+members[i].getMemberName());
		}
	}
	}
}
