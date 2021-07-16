package co.yedam.friend;

public class CompFriend extends Friend {
	// 3)ģ���̸�, ����ó, �μ��� CompFriend; CompFriend[]

	private String department;

	public CompFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "CompFriend [Name=" + getName() + ", Phone=" + getPhone() + ", department=" + department + "]";
	}
	

}
