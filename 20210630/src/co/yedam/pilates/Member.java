package co.yedam.pilates;

public class Member {
	private int memberId;
	private String memberName;
	private String memberPhone;
	private String memberBirth;
	private Gender memberGen; // 남/여
	
	public Member() {

	}
	
	

	public Member(int memberId, String memberName, String memberPhone) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}



	public Member(int memberId, String memberName, String memberPhone, String memberBirth, Gender memberGen) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberBirth = memberBirth;
		this.memberGen = memberGen;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String mamberBirth) {
		this.memberBirth = mamberBirth;
	}

	public Gender getMemberGen() {
		return memberGen;
	}

	public void setMemberGen(Gender memberGen) {
		this.memberGen = memberGen;
	}

	public String showInfo() {
		String info = "회원번호: " + memberId + " 회원이름: " + memberName + " 연락처: " + memberPhone + " 생년월일: " +  memberBirth
				+ " 성별: " +  memberGen;
		return info;
	}

}