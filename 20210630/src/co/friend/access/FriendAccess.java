package co.friend.access;

import java.util.List;

import co.friend.model.Friend;

public interface FriendAccess { //��ɸ� ����
	//������ �̸��� ģ������.
	//�Է� ���� ���� ����Ʈ �̸���ȸ ��ȭ��ȣ��ȸ
	public void insert(Friend friend);
	
	public void update(Friend friend);
	
	public void delete(String name);
	
//	public Friend[] selectAll();
	public List<Friend> selectAll();
	
	
	public Friend selectOne(String name);
	
	public Friend findTel(String tel);
	

}
